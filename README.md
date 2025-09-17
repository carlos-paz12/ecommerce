## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Compiling and Running

To compile and run this project, follow the steps:

1. Compile with `javac`:

   ```sh
   javac -d ./bin -sourcepath src -cp ./lib/gson-2.13.2.jar src/br/edu/ufrn/bcc/lp2/ecommerce/Main.java
   ```

2. Running with `java`:

   ```sh
   java -cp ./bin:./lib/* br.edu.ufrn.bcc.lp2.ecommerce.Main
   ```

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
