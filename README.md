# Java Sandbox

## Goals

Java Sandbox aims to provide a customizable container to develop Java project

## Ticks

* Insall JDK: first starts (after create) of container, you need to install Java JDK
```bash
curl -O https://download.oracle.com/java/24/latest/jdk-24_linux-x64_bin.deb
sudo apt install ./jdk-24_linux-x64_bin.deb
rm ./jdk-24_linux-x64_bin.deb
```

* Test Java:
```bash
cd ~/workspace
javac Hello.java
java Hello
# Expected output : Hello, World!
```

* Very cool emoji and ascii art resources : [https://emojicombos.com/](https://emojicombos.com/)