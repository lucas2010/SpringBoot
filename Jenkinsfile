pipeline {
  agent {
    docker {
      image 'openjdk:11.0.4-jdk'
      args '-v $HOME/.m2:/root/.m2'
    }

  }
  stages {
    stage('build') {
      steps {
        sh './mvnw package'
      }
    }
    stage('repo') {
      steps {
        script {
            def image = docker.image("lucas2010/springboot-demo")
            image.tag("test01")
        }
      }
    }
  }
}