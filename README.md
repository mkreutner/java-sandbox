# Java Sandbox

## Goals

Java Sandbox aims to provide a customizable container to develop Java project

## Ticks

### Test Java:
```bash
cd ~/workspace
javac Hello.java
java Hello
# Expected output : Hello, World!
```

### Very cool emoji and ascii art resources:

[https://emojicombos.com/](https://emojicombos.com/)

### Settings your Visual Studio

* Install extension: `Extension Pack for Java`: [https://github.com/Microsoft/vscode-java-pack](https://github.com/Microsoft/vscode-java-pack)

* Setting up workspace: Open your local project settings in `[working_dir_full_path]/java-sandbox/.vscode/settings.json` and add settings bellow:

```json
{
    "java.configuration.runtimes": [

        {
            "name": "JavaSE-21",
            "path": "[working_dir_full_path]/java-sandbox/data/usr/lib/jvm/jdk-21.0.8-oracle-x64",
            "default": true
        },
    ],
    "java.configuration.detectJdksAtStart": false,
    "java.completion.enabled": true,
    "java.jdt.ls.java.home": "[working_dir_full_path]/java-sandbox/data/usr/lib/jvm/jdk-21.0.8-oracle-x64",
}
```

### Generate Spring project

Visit [https://spring.io/guides/gs/spring-boot](https://spring.io/guides/gs/spring-boot).

1. Visit [https://start.spring.io/](https://start.spring.io/) and complete form, then click on [Ctrl]+[Enter].
2. Unzip archive.
3. `mvn spring-boot:run` 

