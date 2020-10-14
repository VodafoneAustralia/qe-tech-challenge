pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '/home/ec2-user/.m2:/root/.m2'
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