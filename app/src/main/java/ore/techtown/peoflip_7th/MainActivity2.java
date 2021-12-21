package ore.techtown.peoflip_7th;

import android.app.Activity;
import android.app.Instrumentation;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import ore.techtown.peoflip_7th.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        12/10 12:29:00: Launching 'app' on samsung SM-N976N.
//                Install successfully finished in 91 ms.
//                $ adb shell am start -n "ore.techtown.peoflip_7th/ore.techtown.peoflip_7th.MainActivity" -a android.intent.action.MAIN -c android.intent.category.LAUNCHER
//        Connected to process 10231 on device 'samsung-sm_n976n-R3CM8116YPM'.
//                Capturing and displaying logcat messages from application. This behavior can be disabled in the "Logcat output" section of the "Debugger" settings page.
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/ActivityThread;->currentPackageName()Ljava/lang/String; (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->createAppFactory(Landroid/content/pm/ApplicationInfo;Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mIncludeCode:Z (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/util/Slog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I (greylist, linking, allowed)
//        Accessing hidden field Landroid/app/AppComponentFactory;->DEFAULT:Landroid/app/AppComponentFactory; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->createOrUpdateClassLoaderLocked(Ljava/util/List;)V (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/LoadedApk;->mDefaultClassLoader:Ljava/lang/ClassLoader; (blacklist, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mDefaultClassLoader:Ljava/lang/ClassLoader; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->createAppFactory(Landroid/content/pm/ApplicationInfo;Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mIncludeCode:Z (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ActivityThread;->getPackageManager()Landroid/content/pm/IPackageManager; (greylist, linking, allowed)
//        W/own.peoflip_7t: Accessing hidden method Landroid/content/pm/IPackageManager;->notifyPackageUse(Ljava/lang/String;I)V (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mRegisterPackage:Z (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ActivityManager;->getService()Landroid/app/IActivityManager; (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/IActivityManager;->addPackageDependency(Ljava/lang/String;)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/content/pm/ApplicationInfo;->isSystemApp()Z (blacklist,test-api, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mDefaultClassLoader:Ljava/lang/ClassLoader; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->createSharedLibrariesLoaders(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)Ljava/util/List; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->createSharedLibraryLoader(Landroid/content/pm/SharedLibraryInfo;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/ClassLoader; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getLibrariesFor(Ljava/lang/String;)[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/content/pm/IPackageManager;->getApplicationInfo(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo; (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->getProcessDisplayId()I (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ActivityThread;->isInDexDisplay()Z (blacklist, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/LoadedApk;->getServiceDispatcherCommon(Landroid/content/ServiceConnection;Landroid/content/Context;Landroid/os/Handler;Ljava/util/concurrent/Executor;I)Landroid/app/IServiceConnection; (blacklist, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/LoadedApk;->mServices:Landroid/util/ArrayMap; (greylist-max-p, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mServices:Landroid/util/ArrayMap; (greylist-max-p, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk$ServiceDispatcher;-><init>(Landroid/content/ServiceConnection;Landroid/content/Context;Ljava/util/concurrent/Executor;I)V (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk$ServiceDispatcher;-><init>(Landroid/content/ServiceConnection;Landroid/content/Context;Landroid/os/Handler;I)V (greylist, linking, allowed)
//        Accessing hidden field Landroid/app/LoadedApk;->mServices:Landroid/util/ArrayMap; (greylist-max-p, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk$ServiceDispatcher;->getIServiceConnection()Landroid/app/IServiceConnection; (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk$ServiceDispatcher;->validate(Landroid/content/Context;Landroid/os/Handler;Ljava/util/concurrent/Executor;)V (blacklist, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/LoadedApk;->initializeJavaContextClassLoader()V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/content/pm/PackageManager;->getPackageInfoAsUserCached(Ljava/lang/String;II)Landroid/content/pm/PackageInfo; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->makePaths(Landroid/app/ActivityThread;Landroid/content/pm/ApplicationInfo;Ljava/util/List;)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->makePaths(Landroid/app/ActivityThread;ZLandroid/content/pm/ApplicationInfo;Ljava/util/List;Ljava/util/List;)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->makePaths(Landroid/app/ActivityThread;ZLandroid/content/pm/ApplicationInfo;Ljava/util/List;Ljava/util/List;)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/content/pm/ApplicationInfo;->requestsIsolatedSplitLoading()Z (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/ActivityThread;->mInstrumentationPackageName:Ljava/lang/String; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/ActivityThread;->mInstrumentationAppDir:Ljava/lang/String; (greylist, linking, allowed)
//        Accessing hidden field Landroid/app/ActivityThread;->mInstrumentationSplitAppDirs:[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/ActivityThread;->mInstrumentationLibDir:Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/ActivityThread;->mInstrumentedAppDir:Ljava/lang/String; (greylist, linking, allowed)
//        Accessing hidden field Landroid/app/ActivityThread;->mInstrumentedSplitAppDirs:[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/ActivityThread;->mInstrumentedLibDir:Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/content/pm/ApplicationInfo;->requestsIsolatedSplitLoading()Z (greylist-max-o, linking, denied)
//        Accessing hidden method Ldalvik/system/VMRuntime;->is64BitAbi(Ljava/lang/String;)Z (greylist,core-platform-api, linking, allowed)
//        W/own.peoflip_7t: Accessing hidden field Landroid/content/pm/ApplicationInfo;->sharedLibraryInfos:Ljava/util/List; (blacklist, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/LoadedApk;->appendSharedLibrariesLibPathsIfNeeded(Ljava/util/List;Landroid/content/pm/ApplicationInfo;Ljava/util/Set;Ljava/util/List;)V (blacklist, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/LoadedApk;->rewriteRValues(Ljava/lang/ClassLoader;Ljava/lang/String;I)V (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->setApplicationInfo(Landroid/content/pm/ApplicationInfo;)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->adjustNativeLibraryPaths(Landroid/content/pm/ApplicationInfo;)Landroid/content/pm/ApplicationInfo; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V (blacklist, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/LoadedApk;->setupJitProfileSupport()V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/DexLoadReporter;->getInstance()Landroid/app/DexLoadReporter; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->createSharedLibraryLoader(Landroid/content/pm/SharedLibraryInfo;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/ClassLoader; (blacklist, linking, denied)
//        Accessing hidden method Landroid/content/pm/SharedLibraryInfo;->getAllCodePaths()Ljava/util/List; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->forgetReceiverDispatcher(Landroid/content/Context;Landroid/content/BroadcastReceiver;)Landroid/content/IIntentReceiver; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mUnregisteredReceivers:Landroid/util/ArrayMap; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mUnregisteredReceivers:Landroid/util/ArrayMap; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk$ReceiverDispatcher;->setUnregisterLocation(Ljava/lang/RuntimeException;)V (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk$ReceiverDispatcher;->mForgotten:Z (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mUnregisteredReceivers:Landroid/util/ArrayMap; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk$ReceiverDispatcher;->getUnregisterLocation()Ljava/lang/RuntimeException; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->forgetServiceDispatcher(Landroid/content/Context;Landroid/content/ServiceConnection;)Landroid/app/IServiceConnection; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mServices:Landroid/util/ArrayMap; (greylist-max-p, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mServices:Landroid/util/ArrayMap; (greylist-max-p, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk$ServiceDispatcher;->doForget()V (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mUnboundServices:Landroid/util/ArrayMap; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk$ServiceDispatcher;->getUnbindLocation()Ljava/lang/RuntimeException; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getAppDir()Ljava/lang/String; (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->getAppFactory()Landroid/app/AppComponentFactory; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mAppComponentFactory:Landroid/app/AppComponentFactory; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getApplication()Landroid/app/Application; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mApplication:Landroid/app/Application; (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->getApplicationInfo()Landroid/content/pm/ApplicationInfo; (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->getAssets()Landroid/content/res/AssetManager; (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->getResources()Landroid/content/res/Resources; (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->getClassLoader()Ljava/lang/ClassLoader; (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->createOrUpdateClassLoaderLocked(Ljava/util/List;)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getCompatibilityInfo()Landroid/content/res/CompatibilityInfo; (greylist, linking, allowed)
//        Accessing hidden method Landroid/view/DisplayAdjustments;->getCompatibilityInfo()Landroid/content/res/CompatibilityInfo; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getCredentialProtectedDataDirFile()Ljava/io/File; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/LoadedApk;->mCredentialProtectedDataDirFile:Ljava/io/File; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getDataDir()Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getDataDirFile()Ljava/io/File; (greylist, linking, allowed)
//        Accessing hidden field Landroid/app/LoadedApk;->mDataDirFile:Ljava/io/File; (greylist-max-p, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/LoadedApk;->getDeviceProtectedDataDirFile()Ljava/io/File; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mDeviceProtectedDataDirFile:Ljava/io/File; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getLibDir()Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getOverlayDirs()[Ljava/lang/String; (greylist, linking, allowed)
//        Accessing hidden field Landroid/app/LoadedApk;->mOverlayDirs:[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getPackageName()Ljava/lang/String; (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->getReceiverDispatcher(Landroid/content/BroadcastReceiver;Landroid/content/Context;Landroid/os/Handler;Landroid/app/Instrumentation;Z)Landroid/content/IIntentReceiver; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk$ReceiverDispatcher;-><init>(Landroid/content/BroadcastReceiver;Landroid/content/Context;Landroid/os/Handler;Landroid/app/Instrumentation;Z)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk$ReceiverDispatcher;->validate(Landroid/content/Context;Landroid/os/Handler;)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getResDir()Ljava/lang/String; (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->getSplitPaths(Ljava/lang/String;)[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getServiceDispatcher(Landroid/content/ServiceConnection;Landroid/content/Context;Landroid/os/Handler;I)Landroid/app/IServiceConnection; (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->getServiceDispatcherCommon(Landroid/content/ServiceConnection;Landroid/content/Context;Landroid/os/Handler;Ljava/util/concurrent/Executor;I)Landroid/app/IServiceConnection; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getServiceDispatcher(Landroid/content/ServiceConnection;Landroid/content/Context;Ljava/util/concurrent/Executor;I)Landroid/app/IServiceConnection; (blacklist, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/LoadedApk;->getServiceDispatcherCommon(Landroid/content/ServiceConnection;Landroid/content/Context;Landroid/os/Handler;Ljava/util/concurrent/Executor;I)Landroid/app/IServiceConnection; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getSplitAppDirs()[Ljava/lang/String; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/LoadedApk;->mSplitAppDirs:[Ljava/lang/String; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/LoadedApk;->getSplitClassLoader(Ljava/lang/String;)Ljava/lang/ClassLoader; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/LoadedApk;->mSplitLoader:Landroid/app/LoadedApk$SplitDependencyLoaderImpl; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk$SplitDependencyLoaderImpl;->getClassLoaderForSplit(Ljava/lang/String;)Ljava/lang/ClassLoader; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getSplitPaths(Ljava/lang/String;)[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mSplitLoader:Landroid/app/LoadedApk$SplitDependencyLoaderImpl; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk$SplitDependencyLoaderImpl;->getSplitPathsForSplit(Ljava/lang/String;)[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->getSplitResDirs()[Ljava/lang/String; (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->getTargetSdkVersion()I (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->installSystemApplicationInfo(Landroid/content/pm/ApplicationInfo;Ljava/lang/ClassLoader;)V (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mDefaultClassLoader:Ljava/lang/ClassLoader; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->createAppFactory(Landroid/content/pm/ApplicationInfo;Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->isSecurityViolation()Z (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mSecurityViolation:Z (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->lookupServiceDispatcher(Landroid/content/ServiceConnection;Landroid/content/Context;)Landroid/app/IServiceConnection; (greylist, linking, allowed)
//        Accessing hidden field Landroid/app/LoadedApk;->mServices:Landroid/util/ArrayMap; (greylist-max-p, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mServices:Landroid/util/ArrayMap; (greylist-max-p, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/LoadedApk;->makeApplication(ZLandroid/app/Instrumentation;)Landroid/app/Application; (greylist, linking, allowed)
//        W/own.peoflip_7t: Accessing hidden method Landroid/os/Trace;->traceBegin(JLjava/lang/String;)V (greylist, linking, allowed)
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/LoadedApk;->initializeJavaContextClassLoader()V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/content/res/AssetManager;->getAssignedPackageIdentifiers(ZZ)Landroid/util/SparseArray; (blacklist, linking, denied)
//        Accessing hidden field Landroid/app/ActivityThread;->mInstrumentation:Landroid/app/Instrumentation; (greylist, linking, allowed)
//        Accessing hidden field Landroid/app/ActivityThread;->mAllApplications:Ljava/util/ArrayList; (greylist, linking, allowed)
//        Accessing hidden method Landroid/os/Trace;->traceEnd(J)V (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->removeContextRegistrations(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/os/StrictMode;->vmRegistrationLeaksEnabled()Z (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->setCompatibilityInfo(Landroid/content/res/CompatibilityInfo;)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/view/DisplayAdjustments;->setCompatibilityInfo(Landroid/content/res/CompatibilityInfo;)V (greylist, linking, allowed)
//        Accessing hidden method Landroid/app/LoadedApk;->setOverlayDirs([Ljava/lang/String;)V (blacklist, linking, denied)
//        Accessing hidden field Landroid/app/LoadedApk;->mOverlayDirs:[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->updateApplicationInfo(Landroid/content/pm/ApplicationInfo;Ljava/util/List;)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/LoadedApk;->setApplicationInfo(Landroid/content/pm/ApplicationInfo;)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;-><clinit>()V (blacklist, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager;->IS_NOSHIP_BUILD:Z (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;-><init>()V (greylist, linking, allowed)
//        Accessing hidden field Landroid/app/ResourcesManager;->mResConfiguration:Landroid/content/res/Configuration; (greylist, linking, allowed)
//        Accessing hidden field Landroid/app/ResourcesManager;->mResourceImpls:Landroid/util/ArrayMap; (greylist, linking, allowed)
//        Accessing hidden field Landroid/app/ResourcesManager;->mResourceReferences:Ljava/util/ArrayList; (greylist, linking, allowed)
//        Accessing hidden field Landroid/app/ResourcesManager;->mResourcesReferencesQueue:Ljava/lang/ref/ReferenceQueue; (blacklist, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager;->mLoadedApkAssets:Landroid/util/LruCache; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager;->mCachedApkAssets:Landroid/util/ArrayMap; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager;->mActivityResourceReferences:Ljava/util/WeakHashMap; (greylist, linking, allowed)
//        Accessing hidden field Landroid/app/ResourcesManager;->mAdjustedDisplays:Landroid/util/ArrayMap; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager$UpdateHandler;-><init>(Landroid/app/ResourcesManager;Landroid/app/ResourcesManager$1;)V (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->access$200(Landroid/app/ResourcesManager;Landroid/content/res/ResourcesImpl;)Landroid/content/res/ResourcesKey; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->findKeyForResourceImplLocked(Landroid/content/res/ResourcesImpl;)Landroid/content/res/ResourcesKey; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->access$300(Landroid/app/ResourcesManager;Landroid/content/res/ResourcesKey;)Landroid/content/res/ResourcesImpl; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->findOrCreateResourcesImplForKeyLocked(Landroid/content/res/ResourcesKey;)Landroid/content/res/ResourcesImpl; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->access$400(Landroid/app/ResourcesManager;)Landroid/util/ArrayMap; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->access$500(Landroid/app/ResourcesManager;Landroid/util/ArrayMap;)V (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->redirectResourcesToNewImplLocked(Landroid/util/ArrayMap;)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->adjustConfigForDexDisplayIfNeeded(Landroid/content/res/Configuration;ILandroid/view/DisplayAdjustments;)V (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->getAdjustedDisplay(ILandroid/view/DisplayAdjustments;)Landroid/view/Display; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->adjustTab(I)Ljava/lang/String; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->applyConfigurationToResourcesLocked(Landroid/content/res/Configuration;Landroid/content/res/CompatibilityInfo;Landroid/content/res/Configuration;Landroid/content/res/ResourcesKey;Landroid/content/res/ResourcesImpl;)V (blacklist, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/content/res/ResourcesKey;->hasOverrideConfiguration()Z (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->applyNonDefaultDisplayMetricsToConfiguration(Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/ResourcesManager;->applyNonDefaultDisplayMetricsToConfiguration(Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;I)V (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->applyNonDefaultDisplayMetricsToConfiguration(Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;I)V (blacklist, linking, denied)
//        Accessing hidden method Landroid/content/res/Configuration;->resetScreenLayout(I)I (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->buildLogString(Ljava/lang/String;)Ljava/lang/String; (blacklist, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager;->mFormatter:Ljava/time/format/DateTimeFormatter; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->adjustTab(I)Ljava/lang/String; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->cleanupReferences(Ljava/util/ArrayList;Ljava/lang/ref/ReferenceQueue;)V (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/-$$Lambda$ResourcesManager$JPMYJ3O5qlFN-c1356pr2ximEb0;-><init>(Ljava/util/HashSet;)V (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->countLiveReferences(Ljava/util/Collection;)I (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->createResources(Landroid/os/IBinder;Landroid/content/res/ResourcesKey;Ljava/lang/ClassLoader;)Landroid/content/res/Resources; (blacklist, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager;->IS_NOSHIP_BUILD:Z (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->findOrCreateResourcesImplForKeyLocked(Landroid/content/res/ResourcesKey;)Landroid/content/res/ResourcesImpl; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->createResourcesForActivityLocked(Landroid/os/IBinder;Ljava/lang/ClassLoader;Landroid/content/res/ResourcesImpl;Landroid/content/res/CompatibilityInfo;)Landroid/content/res/Resources; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->getOrCreateActivityResourcesStructLocked(Landroid/os/IBinder;)Landroid/app/ResourcesManager$ActivityResources; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->createResourcesImpl(Landroid/content/res/ResourcesKey;)Landroid/content/res/ResourcesImpl; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mOverrideConfiguration:Landroid/content/res/Configuration; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/view/DisplayAdjustments;-><init>(Landroid/content/res/Configuration;)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->createResourcesLocked(Ljava/lang/ClassLoader;Landroid/content/res/ResourcesImpl;Landroid/content/res/CompatibilityInfo;)Landroid/content/res/Resources; (blacklist, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/content/pm/ApplicationInfo;->resourceDirs:[Ljava/lang/String; (greylist, linking, allowed)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mOverlayDirs:[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mOverlayDirs:[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mDisplayId:I (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mPackageName:Ljava/lang/String; (blacklist, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mOverlayDirs:[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mOverlayDirs:[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mOverlayDirs:[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mOverlayDirs:[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mPackageName:Ljava/lang/String; (blacklist, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mResDir:Ljava/lang/String; (greylist, linking, allowed)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mSplitResDirs:[Ljava/lang/String; (greylist, linking, allowed)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mLibDirs:[Ljava/lang/String; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mDisplayId:I (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mOverrideConfiguration:Landroid/content/res/Configuration; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mCompatInfo:Landroid/content/res/CompatibilityInfo; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mPackageName:Ljava/lang/String; (blacklist, linking, denied)
//        Accessing hidden method Landroid/content/res/ResourcesKey;-><init>(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILandroid/content/res/Configuration;Landroid/content/res/CompatibilityInfo;[Landroid/content/res/loader/ResourcesLoader;Ljava/lang/String;)V (greylist, linking, allowed)
//        W/own.peoflip_7t: Accessing hidden field Landroid/content/res/ResourcesKey;->mDisplayId:I (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/content/res/ResourcesKey;->mPackageName:Ljava/lang/String; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->redirectResourcesToNewImplLocked(Landroid/util/ArrayMap;)V (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/ResourcesManager;->mLoadedApkAssets:Landroid/util/LruCache; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager;->mLoadedApkAssets:Landroid/util/LruCache; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager;->mLoadedApkAssets:Landroid/util/LruCache; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/ResourcesManager;->mCachedApkAssets:Landroid/util/ArrayMap; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/ResourcesManager;->countLiveReferences(Ljava/util/Collection;)I (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager;->mCachedApkAssets:Landroid/util/ArrayMap; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->countLiveReferences(Ljava/util/Collection;)I (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->getAdjustedDisplay(ILandroid/content/res/Resources;)Landroid/view/Display; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/hardware/display/DisplayManagerGlobal;->getCompatibleDisplay(ILandroid/content/res/Resources;)Landroid/view/Display; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->getConfiguration()Landroid/content/res/Configuration; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->getDisplayMetrics()Landroid/util/DisplayMetrics; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/ActivityThread;->isInDexDisplay()Z (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->getDisplayMetrics(ILandroid/view/DisplayAdjustments;)Landroid/util/DisplayMetrics; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->getAdjustedDisplay(ILandroid/view/DisplayAdjustments;)Landroid/view/Display; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->getResources(Landroid/os/IBinder;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILandroid/content/res/Configuration;Landroid/content/res/CompatibilityInfo;Ljava/lang/ClassLoader;Ljava/util/List;)Landroid/content/res/Resources; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->getResources(Landroid/os/IBinder;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILandroid/content/res/Configuration;Landroid/content/res/CompatibilityInfo;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/String;)Landroid/content/res/Resources; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->getResources(Landroid/os/IBinder;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILandroid/content/res/Configuration;Landroid/content/res/CompatibilityInfo;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/String;)Landroid/content/res/Resources; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->rebaseKeyForActivity(Landroid/os/IBinder;Landroid/content/res/ResourcesKey;)V (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->createResources(Landroid/os/IBinder;Landroid/content/res/ResourcesKey;Ljava/lang/ClassLoader;)Landroid/content/res/Resources; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->rebaseKeyForActivity(Landroid/os/IBinder;Landroid/content/res/ResourcesKey;)V (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->createResources(Landroid/os/IBinder;Landroid/content/res/ResourcesKey;Ljava/lang/ClassLoader;)Landroid/content/res/Resources; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->invalidatePath(Ljava/lang/String;)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/content/res/ResourcesKey;->isPathReferenced(Ljava/lang/String;)Z (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager;->mCachedApkAssets:Landroid/util/ArrayMap; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager;->mCachedApkAssets:Landroid/util/ArrayMap; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/ResourcesManager$ApkKey;->path:Ljava/lang/String; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/ResourcesManager;->mCachedApkAssets:Landroid/util/ArrayMap; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/content/res/ApkAssets;->close()V (blacklist, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/ResourcesManager;->mCachedApkAssets:Landroid/util/ArrayMap; (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager$ApkKey;->path:Ljava/lang/String; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/ResourcesManager;->mCachedApkAssets:Landroid/util/ArrayMap; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/content/res/ApkAssets;->close()V (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->isSameResourcesOverrideConfig(Landroid/os/IBinder;Landroid/content/res/Configuration;)Z (greylist-max-o, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager$ActivityResources;->overrideConfig:Landroid/content/res/Configuration; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/ResourcesManager$ActivityResources;->overrideConfig:Landroid/content/res/Configuration; (greylist-max-o, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/ResourcesManager$ActivityResources;->overrideConfig:Landroid/content/res/Configuration; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/content/res/Configuration;->diffPublicOnly(Landroid/content/res/Configuration;)I (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->leaveLogCurrentState()V (blacklist, linking, denied)
//        W/own.peoflip_7t: Accessing hidden method Landroid/app/ResourcesManager;->getResourcesHashList()Ljava/lang/String; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->overrideTokenDisplayAdjustments(Landroid/os/IBinder;Ljava/util/function/Consumer;)Z (blacklist, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager$ActivityResources;->activityResources:Ljava/util/ArrayList; (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/content/res/Resources;->overrideDisplayAdjustments(Ljava/util/function/Consumer;)V (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->setDisplayPolicyResources(Landroid/content/res/Resources;I)V (blacklist, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager;->mSavedLogs:Landroid/app/ResourcesManager$EvictingArrayQueue; (blacklist, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager;->mFormatter:Ljava/time/format/DateTimeFormatter; (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager$EvictingArrayQueue;-><init>(Landroid/app/ResourcesManager;I)V (blacklist, linking, denied)
//        Accessing hidden field Landroid/app/ResourcesManager;->mDPResHash:I (blacklist, linking, denied)
//        W/own.peoflip_7t: Accessing hidden field Landroid/app/ResourcesManager;->mDPImplHash:I (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->save(Ljava/lang/String;)V (blacklist, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->updateResourcesForActivity(Landroid/os/IBinder;Landroid/content/res/Configuration;IZ)V (greylist-max-o, linking, denied)
//        Accessing hidden method Landroid/app/ResourcesManager;->getOrCreateActivityResourcesStructLocked(Landroid/os/IBinder;)Landroid/app/ResourcesManager$ActivityResources; (greylist-max-o, linking, denied)
//        Redefining intrinsic method java.lang.Thread java.lang.Thread.currentThread(). This may cause the unexpected use of the original definition of java.lang.Thread java.lang.Thread.currentThread()in methods that have already been compiled.
//                Redefining intrinsic method boolean java.lang.Thread.interrupted(). This may cause the unexpected use of the original definition of boolean java.lang.Thread.interrupted()in methods that have already been compiled.
//                D/ActivityThread: handleBindApplication()++ app=ore.techtown.peoflip_7th
//        W/own.peoflip_7t: ClassLoaderContext classpath size mismatch. expected=0, found=1 (PCL[] | PCL[/data/data/ore.techtown.peoflip_7th/code_cache/.overlay/base.apk/classes3.dex*72411760])
//        Found duplicate classes, falling back to extracting from APK : /data/app/~~iQN_ro2qP97e6io4Pb37NQ==/ore.techtown.peoflip_7th-snyO8CNDB-e2_k2KIsje6A==/base.apk
//        NOTE: This wastes RAM and hurts startup performance.
//                Found duplicated class when checking oat files: 'Lore/techtown/peoflip_7th/BuildConfig;' in /data/app/~~iQN_ro2qP97e6io4Pb37NQ==/ore.techtown.peoflip_7th-snyO8CNDB-e2_k2KIsje6A==/base.apk!classes3.dex and /data/data/ore.techtown.peoflip_7th/code_cache/.overlay/base.apk/classes3.dex
//        D/LoadedApk: LoadedApk::makeApplication() appContext=android.app.ContextImpl@4735d31 appContext.mOpPackageName=ore.techtown.peoflip_7th appContext.mBasePackageName=ore.techtown.peoflip_7th appContext.mPackageInfo=android.app.LoadedApk@69cc16
//        D/NetworkSecurityConfig: No Network Security Config specified, using platform default
//        D/NetworkSecurityConfig: No Network Security Config specified, using platform default
//        D/ActivityThread: handleBindApplication() -- skipGraphicsSupport=false
//        I/DecorView: [INFO] isPopOver=false, config=true
//        updateCaptionType >> DecorView@2cb5d20[], isFloating=false, isApplication=true, hasWindowDecorCaption=false, hasWindowControllerCallback=true
//        D/DecorView: setCaptionType = 0, this = DecorView@2cb5d20[]
//        W/own.peoflip_7t: Accessing hidden method Landroid/view/View;->computeFitSystemWindows(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z (greylist, reflection, allowed)
//        Accessing hidden method Landroid/view/ViewGroup;->makeOptionalFitsSystemWindows()V (greylist, reflection, allowed)
//        D/InputTransport: Input channel constructed: 'b2e90ac', fd=77
//        I/ViewRootImpl@4210e3d[MainActivity]: setView = com.android.internal.policy.DecorView@2cb5d20 TM=true
//        I/SurfaceControl: assignNativeObject: nativeObject = 0 Surface(name=null)/@0x9559eb / android.view.SurfaceControl.readFromParcel:1117 android.view.IWindowSession$Stub$Proxy.relayout:1820 android.view.ViewRootImpl.relayoutWindow:9005 android.view.ViewRootImpl.performTraversals:3360 android.view.ViewRootImpl.doTraversal:2618 android.view.ViewRootImpl$TraversalRunnable.run:9971 android.view.Choreographer$CallbackRecord.run:1010 android.view.Choreographer.doCallbacks:809 android.view.Choreographer.doFrame:744 android.view.Choreographer$FrameDisplayEventReceiver.run:995
//        I/ViewRootImpl@4210e3d[MainActivity]: Relayout returned: old=(0,0,1520,720) new=(57,0,1520,720) req=(1520,720)0 dur=8 res=0x7 s={true 520871602256} ch=true fn=-1
//        I/ViewRootImpl@4210e3d[MainActivity]: [DP] dp(1) 1 android.view.ViewRootImpl.reportNextDraw:10957 android.view.ViewRootImpl.performTraversals:3845 android.view.ViewRootImpl.doTraversal:2618
//        I/ViewRootImpl@4210e3d[MainActivity]: [DP] pd() Asnyc report
//        I/Gralloc4: mapper 4.x is not supported
//        W/Gralloc3: mapper 3.x is not supported
//        I/gralloc: Arm Module v1.0
//        I/ViewRootImpl@4210e3d[MainActivity]: [DP] pdf(0) 1 android.view.ViewRootImpl.lambda$performDraw$1$ViewRootImpl:4668 android.view.-$$Lambda$ViewRootImpl$DJd0VUYJgsebcnSohO6h8zc_ONI.run:6 android.os.Handler.handleCallback:938
//                [DP] rdf()
//        I/ViewRootImpl@4210e3d[MainActivity]: MSG_WINDOW_FOCUS_CHANGED 1 1
//        D/InputMethodManager: prepareNavigationBarInfo() DecorView@2cb5d20[MainActivity]
//        D/InputMethodManager: getNavigationBarColor() -855310
//        D/InputMethodManager: prepareNavigationBarInfo() DecorView@2cb5d20[MainActivity]
//        getNavigationBarColor() -855310
//        V/InputMethodManager: Starting input: tba=ore.techtown.peoflip_7th ic=null mNaviBarColor -855310 mIsGetNaviBarColorSuccess true , NavVisible : true , NavTrans : false
//        D/InputMethodManager: startInputInner - Id : 0
//        I/InputMethodManager: startInputInner - mService.startInputOrWindowGainedFocus
//        D/InputTransport: Input channel constructed: 'ClientS', fd=82
//        D/InputMethodManager: prepareNavigationBarInfo() DecorView@2cb5d20[MainActivity]
//        getNavigationBarColor() -855310
//        V/InputMethodManager: Starting input: tba=ore.techtown.peoflip_7th ic=null mNaviBarColor -855310 mIsGetNaviBarColorSuccess true , NavVisible : true , NavTrans : false
//        D/InputMethodManager: startInputInner - Id : 0
//        V/ViewRootImpl@4210e3d[MainActivity]: updateAppliedLetterboxDirection, direction=1, Caller=android.view.ViewRootImpl.handleDispatchLetterboxDirectionChanged:12114
//        D/DecorView: semSetRoundedCorners: 5
//        I/ViewRootImpl@4210e3d[MainActivity]: MSG_RESIZED_REPORT: frame=(57,0,1520,720) ci=(0,42,0,26) vi=(0,42,0,26) or=2
//                [DP] dp(1) 1 android.view.ViewRootImpl.reportNextDraw:10957 android.view.ViewRootImpl.access$1200:256 android.view.ViewRootImpl$ViewRootHandler.handleMessage:6101
//        I/SurfaceControl: nativeRelease nativeObject s[516039818976]
//        nativeRelease nativeObject e[516039818976]
//        I/SurfaceControl: assignNativeObject: nativeObject = 0 Surface(name=null)/@0x9559eb / android.view.SurfaceControl.readFromParcel:1117 android.view.IWindowSession$Stub$Proxy.relayout:1820 android.view.ViewRootImpl.relayoutWindow:9005 android.view.ViewRootImpl.performTraversals:3360 android.view.ViewRootImpl.doTraversal:2618 android.view.ViewRootImpl$TraversalRunnable.run:9971 android.view.Choreographer$CallbackRecord.run:1010 android.view.Choreographer.doCallbacks:809 android.view.Choreographer.doFrame:744 android.view.Choreographer$FrameDisplayEventReceiver.run:995
//        I/SurfaceControl: nativeRelease nativeObject s[516039816064]
//        nativeRelease nativeObject e[516039816064]
//        I/ViewRootImpl@4210e3d[MainActivity]: Relayout returned: old=(57,0,1520,720) new=(57,0,1520,720) req=(1463,720)0 dur=7 res=0x1 s={true 520871602256} ch=false fn=4
//        I/ViewRootImpl@4210e3d[MainActivity]: [DP] pd() Asnyc report
//        W/libEGL: EGLNativeWindowType 0x79465de860 disconnect failed
//        I/ViewRootImpl@4210e3d[MainActivity]: [DP] pdf(0) 1 android.view.ViewRootImpl.lambda$performDraw$1$ViewRootImpl:4668 android.view.-$$Lambda$ViewRootImpl$DJd0VUYJgsebcnSohO6h8zc_ONI.run:6 android.os.Handler.handleCallback:938
//                [DP] rdf()
//        I/SurfaceControl: nativeRelease nativeObject s[516039818976]
//        nativeRelease nativeObject e[516039818976]
//        I/SurfaceControl: nativeRelease nativeObject s[516039814832]
//        nativeRelease nativeObject e[516039814832]
//        I/SurfaceControl: nativeRelease nativeObject s[516039818416]
//        nativeRelease nativeObject e[516039818416]
//        W/System: A resource failed to call close.
//        W/System: A resource failed to call close.
//        I/ViewRootImpl@4210e3d[MainActivity]: ViewPostIme pointer 0
//        I/ViewRootImpl@4210e3d[MainActivity]: ViewPostIme pointer 1
//        D/AndroidRuntime: Shutting down VM
//        E/AndroidRuntime: FATAL EXCEPTION: main
//        Process: ore.techtown.peoflip_7th, PID: 10231
//        android.content.ActivityNotFoundException: Unable to find explicit activity class {ore.techtown.peoflip_7th/ore.techtown.peoflip_7th.MainActivity2}; have you declared this activity in your AndroidManifest.xml?
//                at android.app.Instrumentation.checkStartActivityResult(Instrumentation.java:2078)
//        at android.app.Instrumentation.execStartActivity(Instrumentation.java:1727)
//        at android.app.Activity.startActivityForResult(Activity.java:5377)
//        at androidx.activity.ComponentActivity.startActivityForResult(ComponentActivity.java:597)
//        at android.app.Activity.startActivityForResult(Activity.java:5335)
//        at androidx.activity.ComponentActivity.startActivityForResult(ComponentActivity.java:583)
//        at android.app.Activity.startActivity(Activity.java:5721)
//        at android.app.Activity.startActivity(Activity.java:5674)
//        at ore.techtown.peoflip_7th.MainActivity.lambda$onCreate$0$MainActivity(MainActivity.java:25)
//        at ore.techtown.peoflip_7th.MainActivity$$ExternalSyntheticLambda0.onClick(Unknown Source:2)
//        at android.view.View.performClick(View.java:8160)
//        at android.widget.TextView.performClick(TextView.java:16222)
//        at com.google.android.material.button.MaterialButton.performClick(MaterialButton.java:1119)
//        at android.view.View.performClickInternal(View.java:8137)
//        at android.view.View.access$3700(View.java:888)
//        at android.view.View$PerformClick.run(View.java:30236)
//        at android.os.Handler.handleCallback(Handler.java:938)
//        at android.os.Handler.dispatchMessage(Handler.java:99)
//        at android.os.Looper.loop(Looper.java:246)
//        at android.app.ActivityThread.main(ActivityThread.java:8633)
//        at java.lang.reflect.Method.invoke(Native Method)
//        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:602)
//        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1130)
//        I/Process: Sending signal. PID: 10231 SIG: 9
    }
}