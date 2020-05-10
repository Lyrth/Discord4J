/*
 * This file is part of Discord4J.
 *
 * Discord4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Discord4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J. If not, see <http://www.gnu.org/licenses/>.
 */

package discord4j.voice;

import discord4j.common.JacksonResources;
import discord4j.common.retry.ReconnectOptions;
import reactor.util.retry.RetrySpec;

import java.time.Duration;

public class VoiceGatewayOptions {

    private final long guildId;
    private final long selfId;
    private final String session;
    private final VoiceServerOptions voiceServerOptions;
    private final JacksonResources jacksonResources;
    private final VoiceReactorResources reactorResources;
    private final ReconnectOptions reconnectOptions;
    private final AudioProvider audioProvider;
    private final AudioReceiver audioReceiver;
    private final VoiceSendTaskFactory sendTaskFactory;
    private final VoiceReceiveTaskFactory receiveTaskFactory;
    private final VoiceDisconnectTask disconnectTask;
    private final VoiceServerUpdateTask serverUpdateTask;
    private final VoiceChannelRetrieveTask channelRetrieveTask;
    private final Duration ipDiscoveryTimeout;
    private final RetrySpec ipDiscoveryRetrySpec;

    public VoiceGatewayOptions(long guildId, long selfId, String session, VoiceServerOptions voiceServerOptions,
                               JacksonResources jacksonResources, VoiceReactorResources reactorResources,
                               ReconnectOptions reconnectOptions, AudioProvider audioProvider, AudioReceiver audioReceiver,
                               VoiceSendTaskFactory sendTaskFactory, VoiceReceiveTaskFactory receiveTaskFactory,
                               VoiceDisconnectTask disconnectTask, VoiceServerUpdateTask serverUpdateTask,
                               VoiceChannelRetrieveTask channelRetrieveTask, Duration ipDiscoveryTimeout,
                               RetrySpec ipDiscoveryRetrySpec) {
        this.guildId = guildId;
        this.selfId = selfId;
        this.session = session;
        this.voiceServerOptions = voiceServerOptions;
        this.jacksonResources = jacksonResources;
        this.reactorResources = reactorResources;
        this.reconnectOptions = reconnectOptions;
        this.audioProvider = audioProvider;
        this.audioReceiver = audioReceiver;
        this.sendTaskFactory = sendTaskFactory;
        this.receiveTaskFactory = receiveTaskFactory;
        this.disconnectTask = disconnectTask;
        this.serverUpdateTask = serverUpdateTask;
        this.channelRetrieveTask = channelRetrieveTask;
        this.ipDiscoveryTimeout = ipDiscoveryTimeout;
        this.ipDiscoveryRetrySpec = ipDiscoveryRetrySpec;
    }

    public long getGuildId() {
        return guildId;
    }

    public long getSelfId() {
        return selfId;
    }

    public String getSession() {
        return session;
    }

    public VoiceServerOptions getVoiceServerOptions() {
        return voiceServerOptions;
    }

    public JacksonResources getJacksonResources() {
        return jacksonResources;
    }

    public VoiceReactorResources getReactorResources() {
        return reactorResources;
    }

    public ReconnectOptions getReconnectOptions() {
        return reconnectOptions;
    }

    public AudioProvider getAudioProvider() {
        return audioProvider;
    }

    public AudioReceiver getAudioReceiver() {
        return audioReceiver;
    }

    public VoiceSendTaskFactory getSendTaskFactory() {
        return sendTaskFactory;
    }

    public VoiceReceiveTaskFactory getReceiveTaskFactory() {
        return receiveTaskFactory;
    }

    public VoiceDisconnectTask getDisconnectTask() {
        return disconnectTask;
    }

    public VoiceServerUpdateTask getServerUpdateTask() {
        return serverUpdateTask;
    }

    public VoiceChannelRetrieveTask getChannelRetrieveTask() {
        return channelRetrieveTask;
    }

    public Duration getIpDiscoveryTimeout() {
        return ipDiscoveryTimeout;
    }

    public RetrySpec getIpDiscoveryRetrySpec() {
        return ipDiscoveryRetrySpec;
    }
}