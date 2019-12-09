package A.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object B_Bb : BuildType({
    uuid = "beb4521c-3bc7-47cb-9c07-d03f1409464a"
    name = "BB"

    features {
        feature {
            id = "KEEP_RULE_2"
            type = "keepRules"
            param("filters.2.type", "tags")
            param("limit.type", "all")
            param("filters.2.tagsList", """
                b2
                over
            """.trimIndent())
            param("ruleDisabled", "false")
            param("keepData.3.type", "everything")
            param("partitions.1.type", "perBranch")
            param("preserveArtifacts", "true")
        }
    }
})
