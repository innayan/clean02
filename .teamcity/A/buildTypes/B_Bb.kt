package A.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object B_Bb : BuildType({
    uuid = "beb4521c-3bc7-47cb-9c07-d03f1409464a"
    name = "BB"

    features {
        feature {
            id = "KEEP_RULE_2"
            type = "keepRules"
            param("limit.type", "all")
            param("keepData.1.artifactPatterns", "+:**/*")
            param("keepData.1.type", "artifacts")
            param("ruleDisabled", "false")
            param("filters.1.type", "tags")
            param("partitions.1.type", "perBranch")
            param("filters.1.tagsList", """
                b2
                over
            """.trimIndent())
            param("preserveArtifacts", "true")
        }
    }
})
