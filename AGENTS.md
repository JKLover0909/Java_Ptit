# AGENTS.md

## Overview
Flat collection of Java practice solutions (PTIT online judge exercises: OOP, file I/O, collections, string processing). Each `.java` file is a standalone program.

## Layout
- `BAI*.java`, `JP*.java`, `DSA_*.java`, `Test*.java`, ... — individual exercise solutions (class name matches file name where possible).
- `*.in` (`DATA1.in`, `DATA2.in`, `ONLINE.in`) — sample input files read by the file-I/O exercises.
- No package structure, build file or tests.

## Commands
- Compile one file: `javac <File>.java`
- Run: `java <MainClass>` (feed input via stdin or the matching `.in` file)

## Rules
- Compiled `*.class` files are gitignored; do not commit build output.
- Do not rename or restructure files without being asked — each file is a separate judge submission, and the public class name must match the file name.
- Keep exercises independent; do not add shared dependencies between them.
