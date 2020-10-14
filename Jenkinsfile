pipeline {
  agent any
  stages {
    stage('Execute Regression suite') {
      steps {
        sh '''cd CoVidGame
mvn clean verify'''
      }
    }

  }
}