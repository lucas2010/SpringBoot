pipeline {
  agent {
    docker {
      image 'openjdk:11-jre-slim'
    }

  }
  stages {
    stage('build') {
      steps {
        sh 'ls'
        sh './mvnw package'
      }
    }
  }
}