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
        
         bat 'docker-compose -f docker-compose.yml up -d'
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
               bat 'docker-compose -f docker-compose.yml down'
         bat 'docker-compose -f docker-compose.yml stop'
      }
    }

  }
  tools {
    maven 'maven'
    jdk 'JAVA'
  }
  post { 
        always { 
            cleanWs()
        }
        success {  
             echo 'This will run only if successful'  
         }  
         failure {  
             mail bcc: '', body: "<b>Example</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "ERROR CI: Project name -> ${env.JOB_NAME}", to: "foo@foomail.com";  
         }  
         unstable {  
             echo 'This will run only if the run was marked as unstable'  
         }  
         changed {  
             echo 'This will run only if the state of the Pipeline has changed'  
             echo 'For example, if the Pipeline was previously failing but is now successful'  
         }  
    }
  options {
    buildDiscarder(logRotator(daysToKeepStr: '1', numToKeepStr: '5'))
  }
}
