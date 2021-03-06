package com.playfab;

import java.util.*;
import com.playfab.PlayFabUtil.*;

public class PlayFabProfilesModels {

    public static enum EffectType {
        Allow,
        Deny
    }

    /** An entity object and its associated meta data. */
    public static class EntityDataObject {
        /** Un-escaped JSON object, if DataAsObject is true. */
        public Object DataObject;
        /** Escaped string JSON body of the object, if DataAsObject is default or false. */
        public String EscapedDataObject;
        /** Name of this object. */
        public String ObjectName;
        
    }

    /** Combined entity type and ID structure which uniquely identifies a single entity. */
    public static class EntityKey {
        /** Unique ID of the entity. */
        public String Id;
        /** Entity type. See https://api.playfab.com/docs/tutorials/entities/entitytypes */
        public String Type;
        
    }

    public static class EntityPermissionStatement {
        /** The action this statement effects. May be 'Read', 'Write' or '*' for both read and write. */
        public String Action;
        /** A comment about the statement. Intended solely for bookkeeping and debugging. */
        public String Comment;
        /** Additional conditions to be applied for entity resources. */
        public Object Condition;
        /** The effect this statement will have. It may be either Allow or Deny */
        public EffectType Effect;
        /** The principal this statement will effect. */
        public Object Principal;
        /** The resource this statements effects. Similar to 'pfrn:data--title![Title ID]/Profile/*' */
        public String Resource;
        
    }

    public static class EntityProfileBody {
        /** The entity id and type. */
        public EntityKey Entity;
        /**
         * The chain of responsibility for this entity. This is a representation of 'ownership'. It is constructed using the
         * following formats (replace '[ID]' with the unique identifier for the given entity): Namespace: 'namespace![Namespace
         * ID]' Title: 'title![Namespace ID]/[Title ID]' Master Player Account: 'master_player_account![Namespace
         * ID]/[MasterPlayerAccount ID]' Title Player Account: 'title_player_account![Namespace ID]/[Title ID]/[MasterPlayerAccount
         * ID]/[TitlePlayerAccount ID]' Character: 'character![Namespace ID]/[Title ID]/[MasterPlayerAccount
         * ID]/[TitlePlayerAccount ID]/[Character ID]'
         */
        public String EntityChain;
        /** The files on this profile. */
        public Map<String,EntityProfileFileMetadata> Files;
        /** The language on this profile. */
        public String Language;
        /** The objects on this profile. */
        public Map<String,EntityDataObject> Objects;
        /**
         * The permissions that govern access to this entity profile and its properties. Only includes permissions set on this
         * profile, not global statements from titles and namespaces.
         */
        public ArrayList<EntityPermissionStatement> Permissions;
        /**
         * The version number of the profile in persistent storage at the time of the read. Used for optional optimistic
         * concurrency during update.
         */
        public Integer VersionNumber;
        
    }

    /** An entity file's meta data. To get a download URL call File/GetFiles API. */
    public static class EntityProfileFileMetadata {
        /** Checksum value for the file */
        public String Checksum;
        /** Name of the file */
        public String FileName;
        /** Last UTC time the file was modified */
        public Date LastModified;
        /** Storage service's reported byte count */
        public Integer Size;
        
    }

    public static class GetEntityProfileRequest {
        /**
         * Determines whether the objects will be returned as an escaped JSON string or as a un-escaped JSON object. Default is
         * JSON string.
         */
        public Boolean DataAsObject;
        /** The entity to perform this action on. */
        public EntityKey Entity;
        
    }

    public static class GetEntityProfileResponse {
        /** Entity profile */
        public EntityProfileBody Profile;
        
    }

    public static class GetEntityProfilesRequest {
        /**
         * Determines whether the objects will be returned as an escaped JSON string or as a un-escaped JSON object. Default is
         * JSON string.
         */
        public Boolean DataAsObject;
        /** Entity keys of the profiles to load. Must be between 1 and 25 */
        public ArrayList<EntityKey> Entities;
        
    }

    public static class GetEntityProfilesResponse {
        /** Entity profiles */
        public ArrayList<EntityProfileBody> Profiles;
        
    }

    public static class GetGlobalPolicyRequest {
        
    }

    public static class GetGlobalPolicyResponse {
        /** The permissions that govern access to all entities under this title or namespace. */
        public ArrayList<EntityPermissionStatement> Permissions;
        
    }

    public static enum OperationTypes {
        Created,
        Updated,
        Deleted,
        None
    }

    public static class SetEntityProfilePolicyRequest {
        /** The entity to perform this action on. */
        public EntityKey Entity;
        /** The statements to include in the access policy. */
        public ArrayList<EntityPermissionStatement> Statements;
        
    }

    public static class SetEntityProfilePolicyResponse {
        /**
         * The permissions that govern access to this entity profile and its properties. Only includes permissions set on this
         * profile, not global statements from titles and namespaces.
         */
        public ArrayList<EntityPermissionStatement> Permissions;
        
    }

    public static class SetGlobalPolicyRequest {
        /** The permissions that govern access to all entities under this title or namespace. */
        public ArrayList<EntityPermissionStatement> Permissions;
        
    }

    public static class SetGlobalPolicyResponse {
        
    }

    public static class SetProfileLanguageRequest {
        /** The entity to perform this action on. */
        public EntityKey Entity;
        /** The expected version of a profile to perform this update on */
        public Integer ExpectedVersion;
        /** The language to set on the given entity. Deletes the profile's language if passed in a null string. */
        public String Language;
        
    }

    public static class SetProfileLanguageResponse {
        /** The type of operation that occured on the profile's language */
        public OperationTypes OperationResult;
        /** The updated version of the profile after the language update */
        public Integer VersionNumber;
        
    }

}
