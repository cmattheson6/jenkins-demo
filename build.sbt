name := """example-app"""
organization := "example.app.com"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

libraryDependencies += guice

enablePlugins(DebianPlugin)
maintainer:= "Cam Mattheson <cmattheson6@gmail.com>"
packageSummary := "My custom package"
packageDescription := "Test Package"
