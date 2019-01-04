import proto.*

fun IGDBWrapper.achievements(apiCalypse: APICalypse): List<proto.Achievement> {
    val bytes = apiRequest(Endpoint.ACHIEVEMENTS.url(), apiCalypse.buildQuery())
    return AchievementResult.parseFrom(bytes).achievementsList
}

fun IGDBWrapper.achievementIcons(apiCalypse: APICalypse): List<proto.AchievementIcon> {
    val bytes = apiRequest(Endpoint.ACHIEVEMENT_ICONS.url(), apiCalypse.buildQuery())
    return AchievementIconResult.parseFrom(bytes).achievementiconsList
}

fun IGDBWrapper.ageRatings(apiCalypse: APICalypse): List<proto.AgeRating> {
    val bytes = apiRequest(Endpoint.AGE_RATINGS.url(), apiCalypse.buildQuery())
    return AgeRatingResult.parseFrom(bytes).ageratingsList
}

fun IGDBWrapper.ageRatingContentDescriptions(apiCalypse: APICalypse): List<proto.AgeRatingContentDescription> {
    val bytes = apiRequest(Endpoint.AGE_RATING_CONTENT_DESCRIPTIONS.url(), apiCalypse.buildQuery())
    return AgeRatingContentDescriptionResult.parseFrom(bytes).ageratingcontentdescriptionsList
}

fun IGDBWrapper.alternativeNames(apiCalypse: APICalypse): List<proto.AlternativeName> {
    val bytes = apiRequest(Endpoint.ALTERNATIVE_NAMES.url(), apiCalypse.buildQuery())
    return AlternativeNameResult.parseFrom(bytes).alternativenamesList
}

fun IGDBWrapper.artworks(apiCalypse: APICalypse): List<proto.Artwork> {
    val bytes = apiRequest(Endpoint.ARTWORKS.url(), apiCalypse.buildQuery())
    return ArtworkResult.parseFrom(bytes).artworksList
}

fun IGDBWrapper.characters(apiCalypse: APICalypse): List<proto.Character> {
    val bytes = apiRequest(Endpoint.CHARACTERS.url(), apiCalypse.buildQuery())
    return CharacterResult.parseFrom(bytes).charactersList
}

fun IGDBWrapper.collections(apiCalypse: APICalypse): List<proto.Collection> {
    val bytes = apiRequest(Endpoint.COLLECTIONS.url(), apiCalypse.buildQuery())
    return CollectionResult.parseFrom(bytes).collectionsList
}

fun IGDBWrapper.characterMugShots(apiCalypse: APICalypse): List<proto.CharacterMugShot> {
    val bytes = apiRequest(Endpoint.CHARACTER_MUG_SHOTS.url(), apiCalypse.buildQuery())
    return CharacterMugShotResult.parseFrom(bytes).charactermugshotsList
}

fun IGDBWrapper.companies(apiCalypse: APICalypse): List<proto.Company> {
    val bytes = apiRequest(Endpoint.COMPANIES.url(), apiCalypse.buildQuery())
    return CompanyResult.parseFrom(bytes).companiesList
}

fun IGDBWrapper.companyWebsites(apiCalypse: APICalypse): List<proto.CompanyWebsite> {
    val bytes = apiRequest(Endpoint.COMPANY_WEBSITES.url(), apiCalypse.buildQuery())
    return CompanyWebsiteResult.parseFrom(bytes).companywebsitesList
}

fun IGDBWrapper.companyLogos(apiCalypse: APICalypse): List<proto.CompanyLogo> {
    val bytes = apiRequest(Endpoint.COMPANY_LOGOS.url(), apiCalypse.buildQuery())
    return CompanyLogoResult.parseFrom(bytes).companylogosList
}

fun IGDBWrapper.covers(apiCalypse: APICalypse): List<proto.Cover> {
    val bytes = apiRequest(Endpoint.COVERS.url(), apiCalypse.buildQuery())
    return CoverResult.parseFrom(bytes).coversList
}

fun IGDBWrapper.externalGames(apiCalypse: APICalypse): List<proto.ExternalGame> {
    val bytes = apiRequest(Endpoint.EXTERNAL_GAMES.url(), apiCalypse.buildQuery())
    return ExternalGameResult.parseFrom(bytes).externalgamesList
}

fun IGDBWrapper.feeds(apiCalypse: APICalypse): List<proto.Feed> {
    val bytes = apiRequest(Endpoint.FEEDS.url(), apiCalypse.buildQuery())
    return FeedResult.parseFrom(bytes).feedsList
}

fun IGDBWrapper.franchises(apiCalypse: APICalypse): List<proto.Franchise> {
    val bytes = apiRequest(Endpoint.FRANCHISES.url(), apiCalypse.buildQuery())
    return FranchiseResult.parseFrom(bytes).franchisesList
}

fun IGDBWrapper.games(apiCalypse: APICalypse): List<proto.Game> {
    val bytes = apiRequest(Endpoint.GAMES.url(), apiCalypse.buildQuery())
    return GameResult.parseFrom(bytes).gamesList
}

fun IGDBWrapper.gameEngines(apiCalypse: APICalypse): List<proto.GameEngine> {
    val bytes = apiRequest(Endpoint.GAME_ENGINES.url(), apiCalypse.buildQuery())
    return GameEngineResult.parseFrom(bytes).gameenginesList
}

fun IGDBWrapper.gameEngineLogos(apiCalypse: APICalypse): List<proto.GameEngineLogo> {
    val bytes = apiRequest(Endpoint.GAME_ENGINE_LOGOS.url(), apiCalypse.buildQuery())
    return GameEngineLogoResult.parseFrom(bytes).gameenginelogosList
}

fun IGDBWrapper.gameModes(apiCalypse: APICalypse): List<proto.GameMode> {
    val bytes = apiRequest(Endpoint.GAME_MODES.url(), apiCalypse.buildQuery())
    return GameModeResult.parseFrom(bytes).gamemodesList
}

fun IGDBWrapper.gameVersion(apiCalypse: APICalypse): List<proto.GameVersion> {
    val bytes = apiRequest(Endpoint.GAME_VERSIONS.url(), apiCalypse.buildQuery())
    return GameVersionResult.parseFrom(bytes).gameversionsList
}

fun IGDBWrapper.gameVersionFeatures(apiCalypse: APICalypse): List<proto.GameVersionFeature> {
    val bytes = apiRequest(Endpoint.GAME_VERSION_FEATURES.url(), apiCalypse.buildQuery())
    return GameVersionFeatureResult.parseFrom(bytes).gameversionfeaturesList
}

fun IGDBWrapper.gameVersionFeatureValues(apiCalypse: APICalypse): List<proto.GameVersionFeatureValue> {
    val bytes = apiRequest(Endpoint.GAME_VERSION_FEATURE_VALUES.url(), apiCalypse.buildQuery())
    return GameVersionFeatureValueResult.parseFrom(bytes).gameversionfeaturevaluesList
}

fun IGDBWrapper.gameVideos(apiCalypse: APICalypse): List<proto.GameVideo> {
    val bytes = apiRequest(Endpoint.GAME_VIDEOS.url(), apiCalypse.buildQuery())
    return GameVideoResult.parseFrom(bytes).gamevideosList
}

fun IGDBWrapper.genres(apiCalypse: APICalypse): List<proto.Genre> {
    val bytes = apiRequest(Endpoint.GENRES.url(), apiCalypse.buildQuery())
    return GenreResult.parseFrom(bytes).genresList
}

fun IGDBWrapper.involvedCompanies(apiCalypse: APICalypse): List<proto.InvolvedCompany> {
    val bytes = apiRequest(Endpoint.INVOLVED_COMPANIES.url(), apiCalypse.buildQuery())
    return InvolvedCompanyResult.parseFrom(bytes).involvedcompaniesList
}

fun IGDBWrapper.keywords(apiCalypse: APICalypse): List<proto.Keyword> {
    val bytes = apiRequest(Endpoint.KEYWORDS.url(), apiCalypse.buildQuery())
    return KeywordResult.parseFrom(bytes).keywordsList
}

fun IGDBWrapper.multiplayerModes(apiCalypse: APICalypse): List<proto.MultiplayerMode> {
    val bytes = apiRequest(Endpoint.MULTIPLAYER_MODES.url(), apiCalypse.buildQuery())
    return MultiplayerModeResult.parseFrom(bytes).multiplayermodesList
}

fun IGDBWrapper.pages(apiCalypse: APICalypse): List<proto.Page> {
    val bytes = apiRequest(Endpoint.PAGES.url(), apiCalypse.buildQuery())
    return PageResult.parseFrom(bytes).pagesList
}

fun IGDBWrapper.pageBackgrounds(apiCalypse: APICalypse): List<proto.PageBackground> {
    val bytes = apiRequest(Endpoint.PAGE_BACKGROUNDS.url(), apiCalypse.buildQuery())
    return PageBackgroundResult.parseFrom(bytes).pagebackgroundsList
}

fun IGDBWrapper.pageLogos(apiCalypse: APICalypse): List<proto.PageLogo> {
    val bytes = apiRequest(Endpoint.PAGE_LOGOS.url(), apiCalypse.buildQuery())
    return PageLogoResult.parseFrom(bytes).pagelogosList
}

fun IGDBWrapper.pageWebsite(apiCalypse: APICalypse): List<proto.PageWebsite> {
    val bytes = apiRequest(Endpoint.PAGE_WEBSITES.url(), apiCalypse.buildQuery())
    return PageWebsiteResult.parseFrom(bytes).pagewebsitesList
}

fun IGDBWrapper.platforms(apiCalypse: APICalypse): List<proto.Platform> {
    val bytes = apiRequest(Endpoint.PLATFORMS.url(), apiCalypse.buildQuery())
    return PlatformResult.parseFrom(bytes).platformsList
}

fun IGDBWrapper.platformLogos(apiCalypse: APICalypse): List<proto.PlatformLogo> {
    val bytes = apiRequest(Endpoint.PLATFORM_LOGOS.url(), apiCalypse.buildQuery())
    return PlatformLogoResult.parseFrom(bytes).platformlogosList
}

fun IGDBWrapper.platformVersions(apiCalypse: APICalypse): List<proto.PlatformVersion> {
    val bytes = apiRequest(Endpoint.PLATFORM_VERSIONS.url(), apiCalypse.buildQuery())
    return PlatformVersionResult.parseFrom(bytes).platformversionsList
}

fun IGDBWrapper.platformVersionCompanies(apiCalypse: APICalypse): List<proto.PlatformVersionCompany> {
    val bytes = apiRequest(Endpoint.PLATFORM_VERSION_COMPANIES.url(), apiCalypse.buildQuery())
    return PlatformVersionCompanyResult.parseFrom(bytes).platformversioncompaniesList
}

fun IGDBWrapper.platformVersionReleaseDates(apiCalypse: APICalypse): List<proto.PlatformVersionReleaseDate> {
    val bytes = apiRequest(Endpoint.PLATFORM_VERSION_RELEASE_DATES.url(), apiCalypse.buildQuery())
    return PlatformVersionReleaseDateResult.parseFrom(bytes).platformversionreleasedatesList
}

fun IGDBWrapper.platformWebsites(apiCalypse: APICalypse): List<proto.PlatformWebsite> {
    val bytes = apiRequest(Endpoint.PLATFORM_WEBSITES.url(), apiCalypse.buildQuery())
    return PlatformWebsiteResult.parseFrom(bytes).platformwebsitesList
}

fun IGDBWrapper.playerPerspectives(apiCalypse: APICalypse): List<proto.PlayerPerspective> {
    val bytes = apiRequest(Endpoint.PLAYER_PERSPECTIVES.url(), apiCalypse.buildQuery())
    return PlayerPerspectiveResult.parseFrom(bytes).playerperspectivesList
}

fun IGDBWrapper.productFamilies(apiCalypse: APICalypse): List<proto.ProductFamily> {
    val bytes = apiRequest(Endpoint.PRODUCT_FAMILIES.url(), apiCalypse.buildQuery())
    return ProductFamilyResult.parseFrom(bytes).productfamiliesList
}

fun IGDBWrapper.pulses(apiCalypse: APICalypse): List<proto.Pulse> {
    val bytes = apiRequest(Endpoint.PULSES.url(), apiCalypse.buildQuery())
    return PulseResult.parseFrom(bytes).pulsesList
}

fun IGDBWrapper.pulseGroups(apiCalypse: APICalypse): List<proto.PulseGroup> {
    val bytes = apiRequest(Endpoint.PULSE_GROUPS.url(), apiCalypse.buildQuery())
    return PulseGroupResult.parseFrom(bytes).pulsegroupsList
}

fun IGDBWrapper.pulseSources(apiCalypse: APICalypse): List<proto.PulseSource> {
    val bytes = apiRequest(Endpoint.PULSE_SOURCES.url(), apiCalypse.buildQuery())
    return PulseSourceResult.parseFrom(bytes).pulsesourcesList
}

fun IGDBWrapper.pulseUrls(apiCalypse: APICalypse): List<proto.PulseUrl> {
    val bytes = apiRequest(Endpoint.PULSE_URLS.url(), apiCalypse.buildQuery())
    return PulseUrlResult.parseFrom(bytes).pulseurlsList
}

fun IGDBWrapper.releaseDates(apiCalypse: APICalypse): List<proto.ReleaseDate> {
    val bytes = apiRequest(Endpoint.RELEASE_DATES.url(), apiCalypse.buildQuery())
    return ReleaseDateResult.parseFrom(bytes).releasedatesList
}

fun IGDBWrapper.screenshots(apiCalypse: APICalypse): List<proto.Screenshot> {
    val bytes = apiRequest(Endpoint.SCREENSHOTS.url(), apiCalypse.buildQuery())
    return ScreenshotResult.parseFrom(bytes).screenshotsList
}

fun IGDBWrapper.search(apiCalypse: APICalypse): List<proto.Search> {
    val bytes = apiRequest(Endpoint.SEARCH.url(), apiCalypse.buildQuery())
    return SearchResult.parseFrom(bytes).searchesList
}

fun IGDBWrapper.themes(apiCalypse: APICalypse): List<proto.Theme> {
    val bytes = apiRequest(Endpoint.THEMES.url(), apiCalypse.buildQuery())
    return ThemeResult.parseFrom(bytes).themesList
}

fun IGDBWrapper.timeToBeats(apiCalypse: APICalypse): List<proto.TimeToBeat> {
    val bytes = apiRequest(Endpoint.TIME_TO_BEATS.url(), apiCalypse.buildQuery())
    return TimeToBeatResult.parseFrom(bytes).timetobeatsList
}

fun IGDBWrapper.titles(apiCalypse: APICalypse): List<proto.Title> {
    val bytes = apiRequest(Endpoint.TITLES.url(), apiCalypse.buildQuery())
    return TitleResult.parseFrom(bytes).titlesList
}

fun IGDBWrapper.websites(apiCalypse: APICalypse): List<proto.Website> {
    val bytes = apiRequest(Endpoint.WEBSITES.url(), apiCalypse.buildQuery())
    return WebsiteResult.parseFrom(bytes).websitesList
}