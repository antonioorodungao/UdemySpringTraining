package com.webbfontaine.springtraining;

/**
 * Created by Antonio Oro Dungao on 1/20/2016.
 */
public class Logger {

    ConsoleWriter consoleWriter;
    FileWriter fileWriter;

    public void log(){
        consoleWriter.write();
        fileWriter.write();
    }

    public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
        this.consoleWriter = consoleWriter;
        this.fileWriter = fileWriter;
    }

    public ConsoleWriter getConsoleWriter() {
        return consoleWriter;
    }

    public void setConsoleWriter(Writer consoleWriter) {
        this.consoleWriter = (ConsoleWriter)consoleWriter;
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }
}
