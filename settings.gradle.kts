// this is an empty umbrella build including all of the component builds
rootProject.name = "pst-all"

includeBuild("../build-logic")
includeBuild("../pst-lib")
includeBuild("../propdm-sync-service")
includeBuild("../pst-api-service")
includeBuild("../pst-gui")