package shares.model;

import java.time.LocalDateTime;

public class Player {
    
    private final String NICKNAME;
    private final LocalDateTime START;
    private final Gender AGENDER;
    
    public enum Gender{
    MALE, FEMALE;
    }
    
    public Player(String nickname,Gender aGender){
        this.NICKNAME = nickname;
        this.AGENDER = aGender;
        START = LocalDateTime.now();
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return NICKNAME;
    }

    /**
     * @return the start
     */
    public LocalDateTime getStart() {
        return START;
    }

    /**
     * @return the aGender
     */
    public Gender getGender() {
        return AGENDER;
    }
    
    
    
}

