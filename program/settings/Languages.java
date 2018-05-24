package shares.program.settings;

public enum Languages {
    ENGLISH("message_en", "english"),
    GERMAN("message_de", "german");
    
    private String messageFile;
    private String displayName;
    
    private Languages(final String messageFile, final String displayName) {
        this.messageFile = messageFile;
        this.displayName = displayName;
    }

    /**
     * @return the messageFile
     */
    public String getMessageFile() {
        return messageFile;
    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }
    
 
}
