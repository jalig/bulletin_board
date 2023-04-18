package ru.skypro.homework.dto;

import lombok.Getter;
import lombok.Setter;
import ru.skypro.homework.model.Ads;

@Getter
@Setter
public class AdsDTO {

    private Long pk;
    private Long user;
    private String image;
    private Integer price;
    private String title;

    public static AdsDTO fromAds(Ads ads) {
        AdsDTO dto = new AdsDTO();
        dto.setPk(ads.getId());
        dto.setUser(ads.getAuthor().getId());
        dto.setImage(ads.getImage().getFilePath());
        dto.setPrice(ads.getPrice());
        dto.setTitle(ads.getTitle());
        return dto;
    }


    public Ads toAds() {
        Ads ads = new Ads();
        ads.setId(this.getPk());
        ads.setPrice(this.getPrice());
        ads.setTitle(this.getTitle());
        return ads;
    }
}



