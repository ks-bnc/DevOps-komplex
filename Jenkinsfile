pipeline {
  agent any /*{
    docker { 
      image 'maven:latest' }
        }*/
stages {
  stage ("build") {
      steps {
        echo "building the application..."
       }
      }
    stage ("test") {
       steps {
         sh 'mvn --version'
          sh "/usr/bin/docker ps
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
