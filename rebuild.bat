cd ms-fe
rmdir /s /q build
call npm run build

cd ..
robocopy ms-fe/build src/main/resources/public /mir

call gradlew clean build
