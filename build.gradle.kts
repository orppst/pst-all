tasks.register("clean"){
    dependsOn(":build-logic:clean", ":platforms:clean")
}