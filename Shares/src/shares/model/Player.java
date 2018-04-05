package shares.model;

import java.time.LocalDateTime;

public class Player {
    
    private final String nickname;
    private final LocalDateTime start;
    private final Gender aGender;
    
    public enum Gender{
    MALE, FEMALE;
    }
    
    public Player(String nickname,Gender aGender){
        this.nickname = nickname;
        this.aGender = aGender;
        start = LocalDateTime.now();
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @return the start
     */
    public LocalDateTime getStart() {
        return start;
    }

    /**
     * @return the aGender
     */
    public Gender getGender() {
        return aGender;
    }
    
    
    
}

