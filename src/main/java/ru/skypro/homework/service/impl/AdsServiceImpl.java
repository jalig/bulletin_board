package ru.skypro.homework.service.impl;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.AdsDTO;
import ru.skypro.homework.dto.CreateAds;
import ru.skypro.homework.dto.FullAds;
import ru.skypro.homework.dto.ResponseWrapperAds;
import ru.skypro.homework.model.Ads;
import ru.skypro.homework.model.User;
import ru.skypro.homework.repository.AdsRepository;
import ru.skypro.homework.service.AdsService;

@Service
public class AdsServiceImpl implements AdsService {

    private final AdsRepository adsRepository;

    public AdsServiceImpl(AdsRepository adsRepository) {
        this.adsRepository = adsRepository;
    }

    @Override
    public ResponseWrapperAds findAllAds() {
        return null;
    }

//    @Override
    public AdsDTO createNewAds(CreateAds createAds, MultipartFile file, Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        Ads ads = createAds.toAds();
        ads.setAuthor(user);
        Ads save = adsRepository.save(ads);
        return AdsDTO.fromAds(save);
    }

    @Override
    public FullAds findAdsById(Long id) {
        return null;
    }

    @Override
    public void deleteAdsById(Long id) {

    }

    @Override
    public AdsDTO updateAdsById(Long id, CreateAds createAds) {
        return null;
    }

    @Override
    public ResponseWrapperAds findAllAuthorizedAds() {
        return null;
    }

    @Override
    public String updateAdsByImage(Long id, MultipartFile file) {
        return null;
    }
}
