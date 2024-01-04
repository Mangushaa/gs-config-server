custom_build(
    ref='gs-config-server:1',
    command='mvnw spring-boot:build-image -Ddocker.image.name=gs-config-server:1',
    tag='1',
    deps=['pom.xml', 'src']
)

k8s_yaml(['/k8s/gs-config-sever.yml'])
k8s_resource(workload='gs-config-server', port_forwards='8080:8080')
