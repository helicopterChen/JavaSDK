package com.playfab;

import java.util.*;
import com.playfab.PlayFabUtil.*;

public class PlayFabMultiplayerModels {

    public static class AssetReference {
        /** The asset's file name. This is a filename with the .zip, .tar, or .tar.gz extension. */
        public String FileName;
        /** The asset's mount path. */
        public String MountPath;
        
    }

    public static class AssetReferenceParams {
        /** The asset's file name. This must be a filename with the .zip, .tar, or .tar.gz extension. */
        public String FileName;
        /** The asset's mount path. */
        public String MountPath;
        
    }

    public static class AssetSummary {
        /** The asset's file name. This is a filename with the .zip, .tar, or .tar.gz extension. */
        public String FileName;
        /** The metadata associated with the asset. */
        public Map<String,String> Metadata;
        
    }

    public static enum AzureRegion {
        AustraliaEast,
        AustraliaSoutheast,
        BrazilSouth,
        CentralUs,
        EastAsia,
        EastUs,
        EastUs2,
        JapanEast,
        JapanWest,
        NorthCentralUs,
        NorthEurope,
        SouthCentralUs,
        SoutheastAsia,
        WestEurope,
        WestUs
    }

    public static enum AzureVmSize {
        Standard_A1,
        Standard_A2,
        Standard_A3,
        Standard_A4,
        Standard_D1_v2,
        Standard_D2_v2,
        Standard_D3_v2,
        Standard_D4_v2,
        Standard_D5_v2
    }

    public static class BuildRegion {
        /** The maximum number of multiplayer servers for the region. */
        public Integer MaxServers;
        /** The build region. */
        public AzureRegion Region;
        /** The number of standby multiplayer servers for the region. */
        public Integer StandbyServers;
        /** The status of multiplayer servers in the build region. */
        public String Status;
        
    }

    public static class BuildRegionParams {
        /** The maximum number of multiplayer servers for the region. */
        public Integer MaxServers;
        /** The build region. */
        public AzureRegion Region;
        /** The number of standby multiplayer servers for the region. */
        public Integer StandbyServers;
        
    }

    public static class BuildSummary {
        /** The guid string build ID of the build. */
        public String BuildId;
        /** The build name. */
        public String BuildName;
        /** The time the build was created in UTC. */
        public Date CreationTime;
        /** The metadata of the build. */
        public Map<String,String> Metadata;
        
    }

    public static class Certificate {
        /** Base64 encoded string contents of the certificate. */
        public String Base64EncodedValue;
        /** A name for the certificate. This is used to reference certificates in build configurations. */
        public String Name;
        /**
         * If required for your PFX certificate, use this field to provide a password that will be used to install the certificate
         * on the container.
         */
        public String Password;
        
    }

    public static class CertificateSummary {
        /** The name of the certificate. */
        public String Name;
        /** The thumbprint for the certificate. */
        public String Thumbprint;
        
    }

    public static class ConnectedPlayer {
        /** The player ID of the player connected to the multiplayer server. */
        public String PlayerId;
        
    }

    public static enum ContainerFlavor {
        ManagedWindowsServerCore,
        CustomLinux,
        ManagedWindowsServerCorePreview
    }

    public static class ContainerImageReference {
        /** The container image name. */
        public String ImageName;
        /** The container tag. */
        public String Tag;
        
    }

    public static class CreateBuildWithCustomContainerRequest {
        /** The build name. */
        public String BuildName;
        /** The flavor of container to create a build from. */
        public ContainerFlavor ContainerFlavor;
        /** The name of the container repository. */
        public String ContainerRepositoryName;
        /** The container command to run when the multiplayer server has been allocated, including any arguments. */
        public String ContainerRunCommand;
        /** The tag for the container. */
        public String ContainerTag;
        /** The list of game assets related to the build. */
        public ArrayList<AssetReferenceParams> GameAssetReferences;
        /** The game certificates for the build. */
        public ArrayList<GameCertificateReferenceParams> GameCertificateReferences;
        /** Metadata to tag the build. */
        public Map<String,String> Metadata;
        /** The number of multiplayer servers to host on a single VM. */
        public Integer MultiplayerServerCountPerVm;
        /** The ports to map the build on. */
        public ArrayList<Port> Ports;
        /** The region configurations for the build. */
        public ArrayList<BuildRegionParams> RegionConfigurations;
        /** The VM size to create the build on. */
        public AzureVmSize VmSize;
        
    }

    public static class CreateBuildWithCustomContainerResponse {
        /** The guid string build ID. Must be unique for every build. */
        public String BuildId;
        /** The build name. */
        public String BuildName;
        /** The flavor of container of the build. */
        public ContainerFlavor ContainerFlavor;
        /** The container command to run when the multiplayer server has been allocated, including any arguments. */
        public String ContainerRunCommand;
        /** The time the build was created in UTC. */
        public Date CreationTime;
        /** The custom game container image reference information. */
        public ContainerImageReference CustomGameContainerImage;
        /** The game assets for the build. */
        public ArrayList<AssetReference> GameAssetReferences;
        /** The game certificates for the build. */
        public ArrayList<GameCertificateReference> GameCertificateReferences;
        /** The metadata of the build. */
        public Map<String,String> Metadata;
        /** The number of multiplayer servers to host on a single VM of the build. */
        public Integer MultiplayerServerCountPerVm;
        /** The ports the build is mapped on. */
        public ArrayList<Port> Ports;
        /** The region configuration for the build. */
        public ArrayList<BuildRegion> RegionConfigurations;
        /** The VM size the build was created on. */
        public AzureVmSize VmSize;
        
    }

    public static class CreateBuildWithManagedContainerRequest {
        /** The build name. */
        public String BuildName;
        /** The flavor of container to create a build from. */
        public ContainerFlavor ContainerFlavor;
        /** The list of game assets related to the build. */
        public ArrayList<AssetReferenceParams> GameAssetReferences;
        /** The game certificates for the build. */
        public ArrayList<GameCertificateReferenceParams> GameCertificateReferences;
        /** Metadata to tag the build. */
        public Map<String,String> Metadata;
        /** The number of multiplayer servers to host on a single VM. */
        public Integer MultiplayerServerCountPerVm;
        /** The ports to map the build on. */
        public ArrayList<Port> Ports;
        /** The region configurations for the build. */
        public ArrayList<BuildRegionParams> RegionConfigurations;
        /** The command to run when the multiplayer server is started, including any arguments. */
        public String StartMultiplayerServerCommand;
        /** The VM size to create the build on. */
        public AzureVmSize VmSize;
        
    }

    public static class CreateBuildWithManagedContainerResponse {
        /** The guid string build ID. Must be unique for every build. */
        public String BuildId;
        /** The build name. */
        public String BuildName;
        /** The flavor of container of the build. */
        public ContainerFlavor ContainerFlavor;
        /** The time the build was created in UTC. */
        public Date CreationTime;
        /** The game assets for the build. */
        public ArrayList<AssetReference> GameAssetReferences;
        /** The game certificates for the build. */
        public ArrayList<GameCertificateReference> GameCertificateReferences;
        /** The metadata of the build. */
        public Map<String,String> Metadata;
        /** The number of multiplayer servers to host on a single VM of the build. */
        public Integer MultiplayerServerCountPerVm;
        /** The ports the build is mapped on. */
        public ArrayList<Port> Ports;
        /** The region configuration for the build. */
        public ArrayList<BuildRegion> RegionConfigurations;
        /** The command to run when the multiplayer server has been allocated, including any arguments. */
        public String StartMultiplayerServerCommand;
        /** The VM size the build was created on. */
        public AzureVmSize VmSize;
        
    }

    public static class CreateRemoteUserRequest {
        /** The guid string build ID of to create the remote user for. */
        public String BuildId;
        /** The expiration time for the remote user created. Defaults to expiring in one day if not specified. */
        public Date ExpirationTime;
        /** The region of virtual machine to create the remote user for. */
        public AzureRegion Region;
        /** The username to create the remote user with. */
        public String Username;
        /** The virtual machine ID the multiplayer server is located on. */
        public String VmId;
        
    }

    public static class CreateRemoteUserResponse {
        /** The expiration time for the remote user created. */
        public Date ExpirationTime;
        /** The generated password for the remote user that was created. */
        public String Password;
        /** The username for the remote user that was created. */
        public String Username;
        
    }

    public static class DeleteAssetRequest {
        /** The filename of the asset to delete. This must be a filename with the .zip, .tar, or .tar.gz extension. */
        public String FileName;
        
    }

    public static class DeleteBuildRequest {
        /** The guid string build ID of the build to delete. */
        public String BuildId;
        
    }

    public static class DeleteCertificateRequest {
        /** The name of the certificate. */
        public String Name;
        
    }

    public static class DeleteRemoteUserRequest {
        /** The guid string build ID of the multiplayer server where the remote user is to delete. */
        public String BuildId;
        /** The region of the multiplayer server where the remote user is to delete. */
        public AzureRegion Region;
        /** The username of the remote user to delete. */
        public String Username;
        /** The virtual machine ID the multiplayer server is located on. */
        public String VmId;
        
    }

    public static class EmptyResponse {
        
    }

    public static class EnableMultiplayerServersForTitleRequest {
        
    }

    public static class EnableMultiplayerServersForTitleResponse {
        /** The enabled status for the multiplayer server features for the title. */
        public TitleMultiplayerServerEnabledStatus Status;
        
    }

    public static class GameCertificateReference {
        /**
         * An alias for the game certificate. The game server will reference this alias via GSDK config to retrieve the game
         * certificate. This alias is used as an identifier in game server code to allow a new certificate with different Name
         * field to be uploaded without the need to change any game server code to reference the new Name.
         */
        public String GsdkAlias;
        /**
         * The name of the game certificate. This name should match the name of a certificate that was previously uploaded to this
         * title.
         */
        public String Name;
        
    }

    public static class GameCertificateReferenceParams {
        /**
         * An alias for the game certificate. The game server will reference this alias via GSDK config to retrieve the game
         * certificate. This alias is used as an identifier in game server code to allow a new certificate with different Name
         * field to be uploaded without the need to change any game server code to reference the new Name.
         */
        public String GsdkAlias;
        /**
         * The name of the game certificate. This name should match the name of a certificate that was previously uploaded to this
         * title.
         */
        public String Name;
        
    }

    public static class GetAssetUploadUrlRequest {
        /** The asset's file name to get the upload URL for. This must be a filename with the .zip, .tar, or .tar.gz extension. */
        public String FileName;
        
    }

    public static class GetAssetUploadUrlResponse {
        /** The asset's upload URL. */
        public String AssetUploadUrl;
        /**
         * The asset's file name to get the upload URL for. This must be a filename will be a file with the .zip, .tar, or .tar.gz
         * extension.
         */
        public String FileName;
        
    }

    public static class GetBuildRequest {
        /** The guid string build ID of the build to get. */
        public String BuildId;
        
    }

    public static class GetBuildResponse {
        /** The guid string build ID of the build. */
        public String BuildId;
        /** The build name. */
        public String BuildName;
        /** The flavor of container of he build. */
        public ContainerFlavor ContainerFlavor;
        /**
         * The container command to run when the multiplayer server has been allocated, including any arguments. This only applies
         * to custom builds. If the build is a managed build, this field will be null.
         */
        public String ContainerRunCommand;
        /** The time the build was created in UTC. */
        public Date CreationTime;
        /** The custom game container image for a custom build. */
        public ContainerImageReference CustomGameContainerImage;
        /** The game assets for the build. */
        public ArrayList<AssetReference> GameAssetReferences;
        /** The game certificates for the build. */
        public ArrayList<GameCertificateReference> GameCertificateReferences;
        /** The metadata of the build. */
        public Map<String,String> Metadata;
        /** The number of multiplayer servers to hosted on a single VM of the build. */
        public Integer MultiplayerServerCountPerVm;
        /** The ports the build is mapped on. */
        public ArrayList<Port> Ports;
        /** The region configuration for the build. */
        public ArrayList<BuildRegion> RegionConfigurations;
        /**
         * The command to run when the multiplayer server has been allocated, including any arguments. This only applies to managed
         * builds. If the build is a custom build, this field will be null.
         */
        public String StartMultiplayerServerCommand;
        /** The VM size the build was created on. */
        public AzureVmSize VmSize;
        
    }

    public static class GetContainerRegistryCredentialsRequest {
        
    }

    public static class GetContainerRegistryCredentialsResponse {
        /** The url of the container registry. */
        public String DnsName;
        /** The password for accessing the container registry. */
        public String Password;
        /** The username for accessing the container registry. */
        public String Username;
        
    }

    public static class GetMultiplayerServerDetailsRequest {
        /** The guid string build ID of the multiplayer server to get details for. */
        public String BuildId;
        /** The region the multiplayer server is located in to get details for. */
        public AzureRegion Region;
        /**
         * The title generated guid string session ID of the multiplayer server to get details for. This is to keep track of
         * multiplayer server sessions.
         */
        public String SessionId;
        
    }

    public static class GetMultiplayerServerDetailsResponse {
        /** The connected players in the multiplayer server. */
        public ArrayList<ConnectedPlayer> ConnectedPlayers;
        /** The IPv4 address of the virtual machine that is hosting this multiplayer server. */
        public String IPV4Address;
        /** The time (UTC) at which a change in the multiplayer server state was observed. */
        public Date LastStateTransitionTime;
        /** The ports the multiplayer server uses. */
        public ArrayList<Port> Ports;
        /** The region the multiplayer server is located in. */
        public AzureRegion Region;
        /** The string server ID of the multiplayer server generated by PlayFab. */
        public String ServerId;
        /** The guid string session ID of the multiplayer server. */
        public String SessionId;
        /** The state of the multiplayer server. */
        public String State;
        /** The virtual machine ID that the multiplayer server is located on. */
        public String VmId;
        
    }

    public static class GetRemoteLoginEndpointRequest {
        /** The guid string build ID of the multiplayer server to get remote login information for. */
        public String BuildId;
        /** The region of the multiplayer server to get remote login information for. */
        public AzureRegion Region;
        /** The virtual machine ID the multiplayer server is located on. */
        public String VmId;
        
    }

    public static class GetRemoteLoginEndpointResponse {
        /** The remote login IPV4 address of multiplayer server. */
        public String IPV4Address;
        /** The remote login port of multiplayer server. */
        public Integer Port;
        
    }

    public static class GetTitleEnabledForMultiplayerServersStatusRequest {
        
    }

    public static class GetTitleEnabledForMultiplayerServersStatusResponse {
        /** The enabled status for the multiplayer server features for the title. */
        public TitleMultiplayerServerEnabledStatus Status;
        
    }

    public static class ListAssetSummariesRequest {
        /** The page size for the request. */
        public Integer PageSize;
        /** The skip token for the paged request. */
        public String SkipToken;
        
    }

    public static class ListAssetSummariesResponse {
        /** The list of asset summaries. */
        public ArrayList<AssetSummary> AssetSummaries;
        /** The page size on the response. */
        public Integer PageSize;
        /** The skip token for the paged response. */
        public String SkipToken;
        
    }

    public static class ListBuildSummariesRequest {
        /** The page size for the request. */
        public Integer PageSize;
        /** The skip token for the paged request. */
        public String SkipToken;
        
    }

    public static class ListBuildSummariesResponse {
        /** The list of build summaries for a title. */
        public ArrayList<BuildSummary> BuildSummaries;
        /** The page size on the response. */
        public Integer PageSize;
        /** The skip token for the paged response. */
        public String SkipToken;
        
    }

    public static class ListCertificateSummariesRequest {
        /** The page size for the request. */
        public Integer PageSize;
        /** The skip token for the paged request. */
        public String SkipToken;
        
    }

    public static class ListCertificateSummariesResponse {
        /** The list of game certificates. */
        public ArrayList<CertificateSummary> CertificateSummaries;
        /** The page size on the response. */
        public Integer PageSize;
        /** The skip token for the paged response. */
        public String SkipToken;
        
    }

    public static class ListContainerImagesRequest {
        /** The page size for the request. */
        public Integer PageSize;
        /** The skip token for the paged request. */
        public String SkipToken;
        
    }

    public static class ListContainerImagesResponse {
        /** The list of container images. */
        public ArrayList<String> Images;
        /** The page size on the response. */
        public Integer PageSize;
        /** The skip token for the paged response. */
        public String SkipToken;
        
    }

    public static class ListContainerImageTagsRequest {
        /** The container images we want to list tags for. */
        public String ImageName;
        
    }

    public static class ListContainerImageTagsResponse {
        /** The list of tags for a particular container image. */
        public ArrayList<String> Tags;
        
    }

    public static class ListMultiplayerServersRequest {
        /** The guid string build ID of the multiplayer servers to list. */
        public String BuildId;
        /** The page size for the request. */
        public Integer PageSize;
        /** The region the multiplayer servers to list. */
        public AzureRegion Region;
        /** The skip token for the paged request. */
        public String SkipToken;
        
    }

    public static class ListMultiplayerServersResponse {
        /** The list of multiplayer server summary details. */
        public ArrayList<MultiplayerServerSummary> MultiplayerServerSummaries;
        /** The page size on the response. */
        public Integer PageSize;
        /** The skip token for the paged response. */
        public String SkipToken;
        
    }

    public static class ListQosServersRequest {
        
    }

    public static class ListQosServersResponse {
        /** The page size on the response. */
        public Integer PageSize;
        /** The list of QoS servers. */
        public ArrayList<QosServer> QosServers;
        /** The skip token for the paged response. */
        public String SkipToken;
        
    }

    public static class ListVirtualMachineSummariesRequest {
        /** The guid string build ID of the virtual machines to list. */
        public String BuildId;
        /** The page size for the request. */
        public Integer PageSize;
        /** The region of the virtual machines to list. */
        public AzureRegion Region;
        /** The skip token for the paged request. */
        public String SkipToken;
        
    }

    public static class ListVirtualMachineSummariesResponse {
        /** The page size on the response. */
        public Integer PageSize;
        /** The skip token for the paged response. */
        public String SkipToken;
        /** The list of virtual machine summaries. */
        public ArrayList<VirtualMachineSummary> VirtualMachines;
        
    }

    public static class MultiplayerServerSummary {
        /** The connected players in the multiplayer server. */
        public ArrayList<ConnectedPlayer> ConnectedPlayers;
        /** The time (UTC) at which a change in the multiplayer server state was observed. */
        public Date LastStateTransitionTime;
        /** The region the multiplayer server is located in. */
        public AzureRegion Region;
        /** The string server ID of the multiplayer server generated by PlayFab. */
        public String ServerId;
        /** The state of the multiplayer server. */
        public String State;
        /** The virtual machine ID that the multiplayer server is located on. */
        public String VmId;
        
    }

    public static class Port {
        /** The name for the port. */
        public String Name;
        /** The number for the port. */
        public Integer Num;
        /** The protocol for the port. */
        public ProtocolType Protocol;
        
    }

    public static enum ProtocolType {
        TCP,
        UDP
    }

    public static class QosServer {
        /** The region the QoS server is located in. */
        public AzureRegion Region;
        /** The QoS server URL. */
        public String ServerUrl;
        
    }

    public static class RequestMultiplayerServerRequest {
        /** The guid string build ID of the multiplayer server to request. */
        public String BuildId;
        /** The preferred regions to request a multiplayer server from. */
        public ArrayList<AzureRegion> PreferredRegions;
        /**
         * Data encoded as a string that is passed to the game server when requested. This can be used to share a cryptographic
         * secret for servers to authenticate clients or to communicate information such as game mode or map through the request
         * flow.
         */
        public String SessionCookie;
        /** A guid string session ID created track the multiplayer server session over its life. */
        public String SessionId;
        
    }

    public static class RequestMultiplayerServerResponse {
        /** The connected players in the multiplayer server. */
        public ArrayList<ConnectedPlayer> ConnectedPlayers;
        /** The IPv4 address of the virtual machine that is hosting this multiplayer server. */
        public String IPV4Address;
        /** The time (UTC) at which a change in the multiplayer server state was observed. */
        public Date LastStateTransitionTime;
        /** The ports the multiplayer server uses. */
        public ArrayList<Port> Ports;
        /** The region the multiplayer server is located in. */
        public AzureRegion Region;
        /** The string server ID of the multiplayer server generated by PlayFab. */
        public String ServerId;
        /** The guid string session ID of the multiplayer server. */
        public String SessionId;
        /** The state of the multiplayer server. */
        public String State;
        /** The virtual machine ID that the multiplayer server is located on. */
        public String VmId;
        
    }

    public static class RolloverContainerRegistryCredentialsRequest {
        
    }

    public static class RolloverContainerRegistryCredentialsResponse {
        /** The url of the container registry. */
        public String DnsName;
        /** The password for accessing the container registry. */
        public String Password;
        /** The username for accessing the container registry. */
        public String Username;
        
    }

    public static class ShutdownMultiplayerServerRequest {
        /** The guid string build ID of the multiplayer server to delete. */
        public String BuildId;
        /** The region of the multiplayer server to shut down. */
        public AzureRegion Region;
        /** A guid string session ID of the multiplayer server to shut down. */
        public String SessionId;
        
    }

    public static enum TitleMultiplayerServerEnabledStatus {
        Initializing,
        Enabled,
        Disabled
    }

    public static class UpdateBuildRegionsRequest {
        /** The guid string ID of the build we want to update regions for. */
        public String BuildId;
        /** The updated region configuration that should be applied to the specified build. */
        public ArrayList<BuildRegionParams> BuildRegions;
        
    }

    public static class UploadCertificateRequest {
        /** The game certificate to upload. */
        public Certificate GameCertificate;
        
    }

    public static class VirtualMachineSummary {
        /** The virtual machine health status. */
        public String HealthStatus;
        /** The virtual machine state. */
        public String State;
        /** The virtual machine ID. */
        public String VmId;
        
    }

}
