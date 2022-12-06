pipeline {
  agent {label 'LocalNode'}
  stages {
    stage('Checkout Scm') {
      steps {
        git 'https://github.com/Ramesvar/Selenium4Grid.git'
      }
    }

    stage('Docker start') {
      steps {
        bat 'docker-compose start'
         bat 'docker-compose up'
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
    stage('Docker end') {
      steps {
               bat 'docker-compose down'
         bat 'docker-compose stop'
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
