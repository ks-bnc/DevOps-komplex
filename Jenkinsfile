pipeline {
  agent {docker {image 'maven:latest'}}
stages {
  stage ("build") {
      steps {
        
        echo "building the application..."
       }
      }
    stage ("test") {
       steps {
       sh "mvn --version"
        echo "testing the application..."
        }
       }
    stage ("deploy") {
        steps {
          echo "deploying the application"
          sh "docker push kissbence599:jenkins/jenkins:lts"
      }
    }
  }
}
