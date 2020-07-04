package pl.sda.ldz24;
/*
login (email)
hasło (hash)
miasto
adres (państwo, miasto, ulica, kod pocztowy)
logotyp/miniaturka/awatar
role (ADMIN/USER - encja)
preferencje kanału otrzymywania wiadomości (poczta/email)
 */


import javax.persistence.*;
import java.util.List;
@Entity
@Table("users")
public class User extends BaseEntity{

    private String email;
    private String password;
    @OneToOne
    private Address address;
    @ManyToMany
    private List<Roles> role;
    private String preferences;




}


