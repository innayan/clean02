package A.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object A_ConfigBCopy : BuildType({
    uuid = "90eb0c3b-0c2c-42a3-bbfd-f5935c3720d2"
    name = "configB_copy"

    artifactRules = "a"

    features {
        feature {
            id = "KEEP_RULE_4"
            type = "keepRules"
            param("filters.2.type", "tags")
            param("limit.type", "all")
            param("filters.2.tagsList", """
                b1
                configB1
            """.trimIndent())
            param("ruleDisabled", "false")
            param("keepData.3.type", "everything")
            param("partitions.1.type", "perBranch")
            param("preserveArtifacts", "true")
        }
        feature {
            id = "KEEP_RULE_5"
            type = "keepRules"
            param("limit.type", "all")
            param("ruleDisabled", "true")
            param("preserveArtifacts", "false")
        }
        feature {
            id = "KEEP_RULE_6"
            type = "keepRules"
            param("filters.2.type", "tags")
            param("limit.type", "all")
            param("filters.2.tagsList", "configB_own")
            param("ruleDisabled", "false")
            param("keepData.3.type", "everything")
            param("partitions.1.type", "perBranch")
            param("preserveArtifacts", "true")
        }
    }
})
