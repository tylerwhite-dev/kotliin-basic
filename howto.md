# How to

1. install java and kotlin
    - curl -s "https://get.sdkman.io" | bash
    - `sdk version`
    - `source "$HOME/.sdkman/bin/sdkman-init.sh"`
    - `sdk java list`
    - `sdk install java [version]-[distro]`
    - `sdk install kotlin`
    - `sdk install gradle`
2. init gradle
    - `gradle init --type basic --dsl kotlin --project-name [project name]`
    - checkout build.gradle.kts
    - `gradle build`
    - `gradle run`