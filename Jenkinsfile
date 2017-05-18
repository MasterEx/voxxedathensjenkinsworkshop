pipeline {
	agent any
	stages {
		stage('Compile') {
			steps {
				sh './mvnw clean build'
			}
		}
		
		stage('Unit test') {
			steps {
				sh './mnvw test'
			}
		}
		
		stage('Build package') {
			steps {
				sh './mvnw clean package'
			}
		}
	}
}
