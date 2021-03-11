pipeline {
  agent any
  docker {image maven:latest}
stages {
  stage ("build") {
      steps {
        
        echo "building the application..."
       }
      }
    stage ("test") {
       steps {
       
        echo "testing the application..."
        }
       }
    stage ("deploy") {
        steps {
          echo "deploying the application"
        }
      }
    }
  }
