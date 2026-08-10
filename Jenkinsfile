pipeline {

    agent any

    tools {
        jdk 'JDK25'
        maven 'Maven-3.9.16'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Source code checked out by Jenkins'
            }
        }

        stage('Environment Check') {
            steps {
                bat 'java -version'
                bat 'mvn -version'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            echo 'Jenkins pipeline completed'
        }
    }
}
