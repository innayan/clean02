package A

import A.buildTypes.*
import A.vcsRoots.*
import A.vcsRoots.A_HttpsGithubComInnayanClean02
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "63192156-e7c6-427c-875a-e9954324aa54"
    id("A")
    parentId("_Root")
    name = "A"

    vcsRoot(A_HttpsGithubComInnayanClean02)

    buildType(A_ConfigBCopy)
    buildType(B_Bb)

    features {
        feature {
            id = "KEEP_RULE_4"
            type = "keepRules"
            param("limit.type", "all")
            param("keepData.1.artifactPatterns", "+:**/*")
            param("keepData.1.type", "artifacts")
            param("ruleDisabled", "false")
            param("filters.1.type", "tags")
            param("partitions.1.type", "perBranch")
            param("filters.1.tagsList", """
                a1
                gg
                test
            """.trimIndent())
            param("preserveArtifacts", "true")
        }
        feature {
            id = "KEEP_RULE_5"
            type = "keepRules"
            param("filters.2.type", "tags")
            param("limit.type", "all")
            param("filters.2.tagsList", "a2")
            param("ruleDisabled", "false")
            param("keepData.3.type", "everything")
            param("partitions.1.type", "perBranch")
            param("preserveArtifacts", "true")
        }
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${A_HttpsGithubComInnayanClean02.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }

    cleanup {
        baseRule {
            all(builds = 123)
            history(builds = 123)
            artifacts(builds = 123)
        }
    }
})
