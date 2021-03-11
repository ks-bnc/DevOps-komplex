pipeline {
  agent {docker { image 'maven:latest' }
        }
stages {
  stage ("build") {
      steps {
        echo "building the application..."
       }
      }
    stage ("test") {
       steps {
         sh 'maven --version'
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
