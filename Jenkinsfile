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
        sh 'mvn clean'
      }
    }

    stage('Maven Build 1') {
      steps {
        sh 'mvn test'
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
