pipeline {
  agent none
  stages {
    stage('Execute Regression suite') {
      steps {
        dir(path: 'CoVidGame') {
          sh 'mvn clean verify'
        }

      }
    }

  }
}