package A_BchiCopyBCopy

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    uuid = "c4e539dd-d92f-4620-bd36-378c2d599bbc"
    id("A_BchiCopyBCopy")
    parentId("A")
    name = "Bchi_copyB_copy"
    description = "d"

    features {
        feature {
            id = "KEEP_RULE_10"
            type = "keepRules"
            param("filters.2.type", "tags")
            param("limit.type", "all")
            param("filters.2.tagsList", """
                b1
                overriden
            """.trimIndent())
            param("ruleDisabled", "false")
            param("keepData.3.type", "everything")
            param("partitions.1.type", "perBranch")
            param("preserveArtifacts", "true")
        }
        feature {
            id = "KEEP_RULE_11"
            type = "keepRules"
            param("limit.type", "all")
            param("ruleDisabled", "true")
            param("preserveArtifacts", "false")
        }
        feature {
            id = "KEEP_RULE_3"
            type = "keepRules"
            param("limit.type", "all")
            param("keepData.1.type", "everything")
            param("ruleDisabled", "false")
            param("filters.1.type", "tags")
            param("partitions.1.type", "perBranch")
            param("filters.1.tagsList", "new")
            param("preserveArtifacts", "true")
        }
    }
})
