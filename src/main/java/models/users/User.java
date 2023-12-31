package models.users;

import java.sql.Date;
import java.sql.Timestamp;

import utils.PasswordHasher;

public class User {
    public int id;
    public final String name, email, profileImage;
    public final Date dob;
    public Timestamp createdAt, updatedAt;
    public String bio;
    private String password;

    public User(int uid, String name, String email, String password, Date dob, String bio, String profileImage,
            Timestamp createdAt,
            Timestamp updatedAt) {
        this.id = uid;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.profileImage = profileImage;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.bio = bio;
        this.password = password;
    }

    public String getHashedPassword() throws Exception {
        return PasswordHasher.generateHash(password);
    }
}
