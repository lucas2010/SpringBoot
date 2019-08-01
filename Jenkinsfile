pipeline {
  agent none
  stages {
    stage('build') {
      agent {
        docker {
            image 'openjdk:11.0.4-jdk'
            args '-v $HOME/.m2:/root/.m2'
        }
      }
      steps {
        sh './mvnw package'
      }
    }
    stage('repo') {
      agent any
      steps {
        script {
            def image = docker.image("lucas2010/springboot-demo:0.0.1-SNAPSHOT")
            image.tag("test01")
        }
      }
    }
  }
}