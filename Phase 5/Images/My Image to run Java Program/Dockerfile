FROM openjdk:11
#COPY *.java .
COPY com .
RUN javac -d . *.java 
CMD [ "java","com.Demo" ]