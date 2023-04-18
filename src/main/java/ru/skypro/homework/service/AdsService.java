package ru.skypro.homework.service;

import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.AdsDTO;
import ru.skypro.homework.dto.CreateAds;
import ru.skypro.homework.dto.FullAds;
import ru.skypro.homework.dto.ResponseWrapperAds;
import ru.skypro.homework.model.Ads;

import java.util.List;

public interface AdsService {
    ResponseWrapperAds findAllAds();

//    AdsDTO createNewAds(CreateAds createAds);

    FullAds findAdsById(Long id);

    void deleteAdsById(Long id);

    AdsDTO updateAdsById(Long id, CreateAds createAds);

    ResponseWrapperAds findAllAuthorizedAds();

    String updateAdsByImage(Long id, MultipartFile file);


}
