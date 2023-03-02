// this is an empty umbrella build including all of the component builds
rootProject.name = "pst-all"

includeBuild("../build-logic")
includeBuild("../pst-lib")
// includeBuild("../propdm-storage-service") // hve excluded this from architecture for now to speed api development
includeBuild("../pst-api-service")
includeBuild("../pst-gui")
includeBuild("../pst-cli-app")