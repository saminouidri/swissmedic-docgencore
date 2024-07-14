![interface](https://i.imgur.com/xxl4YMo.png)
## What is Swissmedic DocGenCore?

DocGenCore is a product of a Bachelor thesis made in collaboration with Swissmedic, who’s goal is to solve a real issue inside the organization.

This issue could be described as the lack of uniformity and coherence in widely-used document generation methods, which is a need common to a number of applications and services developed within Swissmedic. To this day, every one of these entities has developed its own method, which produces a wide variety in scope and quality of the outputs.

Therefore, the proposed solution is to create a shared service, as a Spring API in Java, who’s main purpose is to dynamically generate documents based on template models, which would then be injected with the data the service has received.

During the project’s last stages, the numerous advantages of this approach became quite clear. The documents produced are generic, enabling significant interoperability with other internal services. In addition, the centralized nature of the service improves maintainability considerably, and reduces the workload imposed on the other development teams.

The above picture illustrates a front-end application written in ReactJS, using the Swissmedic Design system. The interface mocks the registration process for a medical device, and when the user clicks "submit", 
a confirmation letter with a random code is generated to demonstrate the full workflow.

Note : as the project deals with sensitive information, only an old skeleton copy of the project is displayed here.

## Tech stack 

The various technologies employed can be roughly sorted into two categories. We have, on the application-side,
the following :
* Spring Boot 3
* Java 17
* Aspose.Words (Document generation/manipulation library)
* Gradle
* Github Enterprise
* Compliance with Sonar quality gates
* Swissmedic Docker images
  
And on the cloud/pipeline-side, we have :
* Swissmedic pipeline workflows
* Microsoft Azure
* Kubernetes
* Helm

## Azure Cloud deployment process

To deploy the API onto Swissmedic's Azure AKS Kubernetes cluster, we first containerized the API using Docker, built the image, and pushed it to the azure container registry (ACR). After generating a Helm chart, we customized the configuration files to align with our API specifications, notably by adding volume mapping, since the application needs to write temporary files. Finally, we deployed the Helm chart to the Kubernetes cluster, verified the deployment status, and accessed the API via the service's external IP. 

## Author(s)
Project and code was built by me.


