# Java Sandbox

## Goals

Java Sandbox aims to provide a customizable container to develop Java project

## After clone

Just run `just setup`

## Ticks

### Test Java:
```bash
cd ~/workspace
javac Hello.java
java Hello
# Expected output : Hello, World!
```

### Very cool resources:

#### Debugger

* [Debugging Java on the Command Line](https://foojay.io/today/jdb/)
* [The jdb Command](https://docs.oracle.com/en/java/javase/17/docs/specs/man/jdb.html)

#### Ascii Art and Emoji

* [https://emojicombos.com/](https://emojicombos.com/)

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

### Play more

- [https://leetcode.com/](https://leetcode.com/)

### Dyma

#### Chapter 05

In order to compile run following commands:

```bash
mkdir -p ./build
javac -d build Color.java Origin.java Fruit.java Main.java
jar cfe ./build/Build.jar sandbox.workspace.dyma.Chap05.Main -C ./build sandbox
java -jar ./build/Build.jar
```

Or

```bash
mkdir -p ./build
javac -d build *.java
jar cfe ./build/Build.jar sandbox.workspace.dyma.Chap05.Main -C ./build sandbox
java -jar ./build/Build.jar
```

### Chapter 07

I use maven, to build project: 

```bash
mvn package
```

then to run the project

```bash
java -cp target/chap07-1.0-SNAPSHOT.jar com.mkdevs.Main
```

#### Tic Tac Toe Game

**Generate project**

```bash
mvn archetype:generate -DgroupId=com.mkdevs.dyma -DartifactId=tic-tac-toe -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=flase
```

**Build**

```bash
mvn package
```

**Execute**

```bash
java -cp target/tic-tac-toe-1.0-SNAPSHOT.jar com.mkdev.dyma.App
```