package pl.kul.cinemix.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "movies", uniqueConstraints = {@UniqueConstraint(columnNames = "title")})
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 128)
    private String title;

    @NotBlank
    @Size(max = 64)
    private String author;

    private String description;

    private String year;

    private String country;


    private int duration;

    public Movie(
            @NotBlank @Size(max = 64) String author,
            @NotBlank @Size(max = 128) String title,
             String description,
             String year,
             String country,
             int duration) {

        this.title = title;
        this.author = author;
        this.description = description;
        this.year = year;
        this.country = country;
        this.duration = duration;

    }
}
