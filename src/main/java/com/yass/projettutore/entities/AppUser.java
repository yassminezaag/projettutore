package com.yass.projettutore.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id
    private String username;
    private int active;
    private String password;
    @ManyToMany
    @JoinTable(name = "app_user_roles",
    joinColumns = @JoinColumn(name = "app_user_username", referencedColumnName = "username"),
    inverseJoinColumns = @JoinColumn(name = "roles_role_name", referencedColumnName = "role_name"))
    private Set<AppRole> roles = new HashSet<AppRole>();
    //@ManyToMany(fetch = FetchType.LAZY,
    //            cascade = {
    //                CascadeType.PERSIST,
    //                CascadeType.MERGE
    //            })


}
