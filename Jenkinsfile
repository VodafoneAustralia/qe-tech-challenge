pipeline {
  agent {
    docker {
      image 'maven'
      args '-v $HOME/.m2:/root/.m2'
    }

  }
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