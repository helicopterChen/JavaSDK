package com.playfab;

import java.util.Map;

public class PlayFabErrors {
    /**
     * Error codes returned by PlayFabAPIs
     */
    public static enum PlayFabErrorCode {
        Success(0),
        Unknown(1),
        ConnectionError(2),
        JsonParseError(3),
        InvalidParams(1000),
        AccountNotFound(1001),
        AccountBanned(1002),
        InvalidUsernameOrPassword(1003),
        InvalidTitleId(1004),
        InvalidEmailAddress(1005),
        EmailAddressNotAvailable(1006),
        InvalidUsername(1007),
        InvalidPassword(1008),
        UsernameNotAvailable(1009),
        InvalidSteamTicket(1010),
        AccountAlreadyLinked(1011),
        LinkedAccountAlreadyClaimed(1012),
        InvalidFacebookToken(1013),
        AccountNotLinked(1014),
        FailedByPaymentProvider(1015),
        CouponCodeNotFound(1016),
        InvalidContainerItem(1017),
        ContainerNotOwned(1018),
        KeyNotOwned(1019),
        InvalidItemIdInTable(1020),
        InvalidReceipt(1021),
        ReceiptAlreadyUsed(1022),
        ReceiptCancelled(1023),
        GameNotFound(1024),
        GameModeNotFound(1025),
        InvalidGoogleToken(1026),
        UserIsNotPartOfDeveloper(1027),
        InvalidTitleForDeveloper(1028),
        TitleNameConflicts(1029),
        UserisNotValid(1030),
        ValueAlreadyExists(1031),
        BuildNotFound(1032),
        PlayerNotInGame(1033),
        InvalidTicket(1034),
        InvalidDeveloper(1035),
        InvalidOrderInfo(1036),
        RegistrationIncomplete(1037),
        InvalidPlatform(1038),
        UnknownError(1039),
        SteamApplicationNotOwned(1040),
        WrongSteamAccount(1041),
        TitleNotActivated(1042),
        RegistrationSessionNotFound(1043),
        NoSuchMod(1044),
        FileNotFound(1045),
        DuplicateEmail(1046),
        ItemNotFound(1047),
        ItemNotOwned(1048),
        ItemNotRecycleable(1049),
        ItemNotAffordable(1050),
        InvalidVirtualCurrency(1051),
        WrongVirtualCurrency(1052),
        WrongPrice(1053),
        NonPositiveValue(1054),
        InvalidRegion(1055),
        RegionAtCapacity(1056),
        ServerFailedToStart(1057),
        NameNotAvailable(1058),
        InsufficientFunds(1059),
        InvalidDeviceID(1060),
        InvalidPushNotificationToken(1061),
        NoRemainingUses(1062),
        InvalidPaymentProvider(1063),
        PurchaseInitializationFailure(1064),
        DuplicateUsername(1065),
        InvalidBuyerInfo(1066),
        NoGameModeParamsSet(1067),
        BodyTooLarge(1068),
        ReservedWordInBody(1069),
        InvalidTypeInBody(1070),
        InvalidRequest(1071),
        ReservedEventName(1072),
        InvalidUserStatistics(1073),
        NotAuthenticated(1074),
        StreamAlreadyExists(1075),
        ErrorCreatingStream(1076),
        StreamNotFound(1077),
        InvalidAccount(1078),
        PurchaseDoesNotExist(1080),
        InvalidPurchaseTransactionStatus(1081),
        APINotEnabledForGameClientAccess(1082),
        NoPushNotificationARNForTitle(1083),
        BuildAlreadyExists(1084),
        BuildPackageDoesNotExist(1085),
        CustomAnalyticsEventsNotEnabledForTitle(1087),
        InvalidSharedGroupId(1088),
        NotAuthorized(1089),
        MissingTitleGoogleProperties(1090),
        InvalidItemProperties(1091),
        InvalidPSNAuthCode(1092),
        InvalidItemId(1093),
        PushNotEnabledForAccount(1094),
        PushServiceError(1095),
        ReceiptDoesNotContainInAppItems(1096),
        ReceiptContainsMultipleInAppItems(1097),
        InvalidBundleID(1098),
        JavascriptException(1099),
        InvalidSessionTicket(1100),
        UnableToConnectToDatabase(1101),
        InternalServerError(1110),
        InvalidReportDate(1111),
        ReportNotAvailable(1112),
        DatabaseThroughputExceeded(1113),
        InvalidLobbyId(1114),
        InvalidGameTicket(1115),
        ExpiredGameTicket(1116),
        GameTicketDoesNotMatchLobby(1117),
        LinkedDeviceAlreadyClaimed(1118),
        DeviceAlreadyLinked(1119),
        DeviceNotLinked(1120),
        PartialFailure(1121),
        PublisherNotSet(1122),
        ServiceUnavailable(1123),
        VersionNotFound(1124),
        RevisionNotFound(1125),
        InvalidPublisherId(1126),
        DownstreamServiceUnavailable(1127),
        APINotIncludedInTitleUsageTier(1128),
        DAULimitExceeded(1129),
        APIRequestLimitExceeded(1130),
        InvalidAPIEndpoint(1131),
        BuildNotAvailable(1132),
        ConcurrentEditError(1133),
        ContentNotFound(1134),
        CharacterNotFound(1135),
        CloudScriptNotFound(1136),
        ContentQuotaExceeded(1137),
        InvalidCharacterStatistics(1138),
        PhotonNotEnabledForTitle(1139),
        PhotonApplicationNotFound(1140),
        PhotonApplicationNotAssociatedWithTitle(1141),
        InvalidEmailOrPassword(1142),
        FacebookAPIError(1143),
        InvalidContentType(1144),
        KeyLengthExceeded(1145),
        DataLengthExceeded(1146),
        TooManyKeys(1147),
        FreeTierCannotHaveVirtualCurrency(1148),
        MissingAmazonSharedKey(1149),
        AmazonValidationError(1150),
        InvalidPSNIssuerId(1151),
        PSNInaccessible(1152),
        ExpiredAuthToken(1153),
        FailedToGetEntitlements(1154),
        FailedToConsumeEntitlement(1155),
        TradeAcceptingUserNotAllowed(1156),
        TradeInventoryItemIsAssignedToCharacter(1157),
        TradeInventoryItemIsBundle(1158),
        TradeStatusNotValidForCancelling(1159),
        TradeStatusNotValidForAccepting(1160),
        TradeDoesNotExist(1161),
        TradeCancelled(1162),
        TradeAlreadyFilled(1163),
        TradeWaitForStatusTimeout(1164),
        TradeInventoryItemExpired(1165),
        TradeMissingOfferedAndAcceptedItems(1166),
        TradeAcceptedItemIsBundle(1167),
        TradeAcceptedItemIsStackable(1168),
        TradeInventoryItemInvalidStatus(1169),
        TradeAcceptedCatalogItemInvalid(1170),
        TradeAllowedUsersInvalid(1171),
        TradeInventoryItemDoesNotExist(1172),
        TradeInventoryItemIsConsumed(1173),
        TradeInventoryItemIsStackable(1174),
        TradeAcceptedItemsMismatch(1175),
        InvalidKongregateToken(1176),
        FeatureNotConfiguredForTitle(1177),
        NoMatchingCatalogItemForReceipt(1178),
        InvalidCurrencyCode(1179),
        NoRealMoneyPriceForCatalogItem(1180),
        TradeInventoryItemIsNotTradable(1181),
        TradeAcceptedCatalogItemIsNotTradable(1182),
        UsersAlreadyFriends(1183),
        LinkedIdentifierAlreadyClaimed(1184),
        CustomIdNotLinked(1185),
        TotalDataSizeExceeded(1186),
        DeleteKeyConflict(1187),
        InvalidXboxLiveToken(1188),
        ExpiredXboxLiveToken(1189),
        ResettableStatisticVersionRequired(1190),
        NotAuthorizedByTitle(1191),
        NoPartnerEnabled(1192),
        InvalidPartnerResponse(1193),
        APINotEnabledForGameServerAccess(1194),
        StatisticNotFound(1195),
        StatisticNameConflict(1196),
        StatisticVersionClosedForWrites(1197),
        StatisticVersionInvalid(1198);

        public int id;

        private PlayFabErrorCode(int id) {
            this.id = id;
        }

        public boolean equals(int i) {
            return i == id;
        }

        public boolean equals(PlayFabErrorCode o) {
            return equals(o.id);
        }

        public static PlayFabErrorCode getFromCode(int code) {
            for(PlayFabErrorCode error : PlayFabErrorCode.values()) {
                if(error.equals(code)) {
                    return error;
                }
            }
            return PlayFabErrorCode.Unknown;
        }

    }

    public static class PlayFabError {
        public int httpCode;
        public String httpStatus;
        public PlayFabErrorCode pfErrorCode;
        public String errorMessage;
    }

    public static class PlayFabJsonError {
        public int code;
        public String status;
        public String error;
        public int errorCode;
        public String errorMessage;
    }

    public static class PlayFabJsonSuccess<E> {
        public int code;
        public String status;
        public E data;
    }

    public static class PlayFabResult<ResultT> {
        public PlayFabError Error;
        public ResultT Result;
    }

    public static interface ErrorCallback {
        public void callback(PlayFabError error);
    }
}
