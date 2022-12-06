pipeline {
  agent any
  stages {
    stage('Checkout Scm') {
      steps {
        git 'https://github.com/Ramesvar/Selenium4Grid.git'
      }
    }

    stage('Maven Build 0') {
      steps {
        bat 'mvn clean'
      }
    }

    stage('Maven Build 1') {
      steps {
        bat 'mvn test'
      }
    }

  }
  tools {
    maven 'maven'
    jdk 'JAVA'
  }
  options {
    buildDiscarder(logRotator(daysToKeepStr: '1', numToKeepStr: '5'))
  }
}
