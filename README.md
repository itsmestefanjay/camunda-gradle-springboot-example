## General
This project builds a springboot application with an embedded camunda engine and a sample process

## Process
* the process consist of a `user task` and a `service task`
* the `service task` calls a `JavaDelegate` which logs some output

## Build
Run `gradlew bootRun` to build and start the application