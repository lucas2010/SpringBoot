pipeline {
  agent {
    docker {
      image 'openjdk:11.0.4-jdk'
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