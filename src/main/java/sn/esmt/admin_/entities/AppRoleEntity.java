package sn.esmt.admin_.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="approles")

public class AppRoleEntity {
    @javax.persistence.Id//JPA ID est la clée primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
    private int id;

    @Column(length = 100,nullable = false)
    private String name;


}
